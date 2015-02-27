SUMMARY = "Miscellaneous multimedia tools/servers"
LICENSE = "MIT"
PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = "packagegroups-mariano-alsa mpd"
