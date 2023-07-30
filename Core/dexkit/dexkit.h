#pragma once

#include <string_view>
#include <thread>
#include <vector>

#include "dex_item.h"
#include "file_helper.h"
#include "ThreadPool.h"
#include "filter.h"
#include "error.h"

namespace dexkit {

class DexKit {
public:

    explicit DexKit() = default;
    explicit DexKit(std::string_view apk_path, int unzip_thread_num = 0);

    Error AddDex(uint8_t *data, size_t size);
    Error AddImage(std::unique_ptr<MemMap> dex_image);
    Error AddImage(std::vector<std::unique_ptr<MemMap>> dex_images);
    Error AddZipPath(std::string_view apk_path, int unzip_thread_num = 0);

    ~DexKit() = default;

    void SetThreadNum(int num) {
        _thread_num = num;
    }

    Error ExportDexFile(std::string_view path);

private:
    uint32_t _thread_num = std::thread::hardware_concurrency();
    std::vector<std::unique_ptr<DexItem>> dex_items;
};

} // namespace dexkit