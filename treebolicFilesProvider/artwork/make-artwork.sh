#!/bin/bash

source "lib-artwork.sh"

subdir="treebolic/provider/files/images"

icon="*.svg"
root="root*.svg"

make_resource "${icon}" 32 "${subdir}"
make_resource "${root}" 48 "${subdir}"

checkdir

