#!/bin/bash
wget https://github.com/quark-zju/lrun/releases/download/v1.1.4/lrun_1.1.4_amd64.deb
apt-get install libseccomp2 -y
apt-get install git -y
dpkg -i lrun_1.1.4_amd64.deb
gpasswd -a $USER lrun

git clone https://github.com/quark-zju/ljudge
cd ljudge
make && sudo make install 
cp -r etc/ljudge /etc/ljudge

echo "Log out and relogin will successful."





