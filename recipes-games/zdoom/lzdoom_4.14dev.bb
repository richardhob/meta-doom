SUMMARY = "Open Source Doom Engine"
HOMEPAGE = "http://zdoom.org"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"
SECTION = "games"

DEPENDS = "\
    bzip2-replacement-native \
    libsdl2 \
    libvpx \
    zmusic \
    "

PROVIDES = "virtual/zdoom"

SRC_URI = "\
    git://github.com/drfrag666/lzdoom;protocol=http;nobranch=1 \
"

SRCREV = "bba467e21d4213ec9a0901992d232a337ee301eb"

inherit features_check

REQUIRED_DISTRO_FEATURES = "opengl"

CFLAGS += "-Wno-old-style-definition"
CXXFLAGS += "-Wno-template-id-cdtor"

require zdoom.inc

INSANE_SKIP += "buildpaths"
