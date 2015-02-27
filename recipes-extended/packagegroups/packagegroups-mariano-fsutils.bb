SUMMARY = "File system tools"
LICENSE = "MIT"
PR = "r1"

inherit packagegroup

#RDEPENDS_${PN} = "fuse-exfat fuse-utils libmount1 libntfs-3g libulockmgr ntfs-3g ntfsprogs util-linux-blkid util-linux-mount"

RDEPENDS_${PN} = "fuse-exfat fuse-utils libntfs-3g libulockmgr ntfs-3g ntfsprogs util-linux-blkid util-linux-mount"
