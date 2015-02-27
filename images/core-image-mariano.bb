SUMMARY = "A console-only image that fully supports the target device \
hardware."

IMAGE_FEATURES += "splash package-management ssh-server-openssh hwcodecs"

inherit core-image

LICENSE = "MIT"

IMAGE_INSTALL += "packagegroups-mariano-multimedia packagegroups-mariano-fsutils"
