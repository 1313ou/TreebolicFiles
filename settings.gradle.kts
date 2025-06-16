/*
 * Copyright (c) 2024. Bernard Bou <1313ou@gmail.com>
 */

pluginManagement {
    repositories {
        gradlePluginPortal()
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenLocal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}

// C O R E

include(":treebolicGlue")
project(":treebolicGlue").projectDir = File("../TreebolicLib/treebolicGlue/")

include(":treebolicIface")
project(":treebolicIface").projectDir = File("../TreebolicLib/treebolicIface/")

// L I B S

include(":commonLib")
project(":commonLib").projectDir = File("../TreebolicSupportLibs/commonLib/")

include(":searchLib")
project(":searchLib").projectDir = File("../TreebolicSupportLibs/searchLib/")

include(":wheelLib")
project(":wheelLib").projectDir = File("../TreebolicSupportLibs/wheelLib/")

include(":guideLib")
project(":guideLib").projectDir = File("../TreebolicSupportLibs/guideLib/")

include(":downloadLib")
project(":downloadLib").projectDir = File("../TreebolicSupportLibs/downloadLib/")

include(":preferenceLib")
project(":preferenceLib").projectDir = File("../TreebolicSupportLibs/preferenceLib/")

include(":fileChooserLib")
project(":fileChooserLib").projectDir = File("../TreebolicSupportLibs/fileChooserLib/")

include(":storageLib")
project(":storageLib").projectDir = File("../TreebolicSupportLibs/storageLib/")

include(":colorLib")
project(":colorLib").projectDir = File("../TreebolicSupportLibs/colorLib/")

include(":xPreferenceLib")
project(":xPreferenceLib").projectDir = File("../TreebolicWordNet/xPreferenceLib/")

include(":testLib")
project(":testLib").projectDir = File("../TreebolicSupportLibs/testLib/")

include(":rateLib")
project(":rateLib").projectDir = File("../TreebolicSponsorLibs/rateLib/")

include(":othersLib")
project(":othersLib").projectDir = File("../TreebolicSponsorLibs/othersLib/")

include(":donateLib")
project(":donateLib").projectDir = File("../TreebolicSponsorLibs/donateLib/")

// C O R E   L I B S

include(":treebolicParcel")
project(":treebolicParcel").projectDir = File("../TreebolicServices/treebolicParcel/")

include(":treebolicPluginLib")
project(":treebolicPluginLib").projectDir = File("../TreebolicPlugins/treebolicPluginLib/")

// S E R V I C E / C L I E N T

include(":treebolicAidl")
project(":treebolicAidl").projectDir = File("../TreebolicServices/treebolicAidl/")

include(":treebolicClientsLib")
project(":treebolicClientsLib").projectDir = File("../TreebolicServices/treebolicClientsLib/")

include(":treebolicClientsIface")
project(":treebolicClientsIface").projectDir = File("../TreebolicServices/treebolicClientsIface/")

include(":treebolicServicesLib")
project(":treebolicServicesLib").projectDir = File("../TreebolicServices/treebolicServicesLib/")

include(":treebolicServicesIface")
project(":treebolicServicesIface").projectDir = File("../TreebolicServices/treebolicServicesIface/")

// P R O V I D E R S

include(":treebolicFilesProvider")
project(":treebolicFilesServices").projectDir = File("./treebolicFilesServices/")

// A P P S

include(":treebolic")
project(":treebolic").projectDir = File("../Treebolic/treebolic/")

include(":treebolicFilesPlugin")
project(":treebolicFilesPlugin").projectDir = File("../TreebolicPlugins/treebolicFilesPlugin/")

include(":treebolicFilesServices")
project(":treebolicFilesServices").projectDir = File("../TreebolicServices/treebolicFilesServices/")

