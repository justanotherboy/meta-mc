SUMMARY = "ALSA toolkit"
LICENSE = "MIT"
PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = "alsa-states alsa-tools alsa-utils-alsaconf"
