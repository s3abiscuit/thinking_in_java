//: holding/EnvironmentVariables.java
import java.util.*;

public class EnvironmentVariables {
  public static void main(String[] args) {
    for(Map.Entry entry: System.getenv().entrySet()) {
      System.out.println(entry.getKey() + ": " +
        entry.getValue());
    }
  }
} /* (Execute to see output) *///:~
/*
PATH: /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/local/games:/usr/games:/snap/bin
XAUTHORITY: /home/pi/.Xauthority
XMODIFIERS: @im=SCIM
_LXSESSION_PID: 974
GDMSESSION: lightdm-xsession
XDG_DATA_DIRS: /usr/share/fkms:/usr/local/share:/usr/share/raspi-ui-overrides:/usr/share:/usr/share/gdm:/var/lib/menu-xdg
QT_IM_MODULE: xim
GTK_IM_MODULE: scim-bridge
XDG_CONFIG_DIRS: /etc/xdg
XDG_SEAT_PATH: /org/freedesktop/DisplayManager/Seat0
DBUS_SESSION_BUS_ADDRESS: unix:path=/run/user/1000/bus
LANG: en_US
XDG_SESSION_TYPE: x11
XDG_SESSION_ID: c2
XDG_CURRENT_DESKTOP: LXDE
DISPLAY: :0.0
SSH_AGENT_PID: 1090
QT4_IM_MODULE: scim
LOGNAME: pi
PWD: /home/pi/code/github/thinking_in_java/examples/holding/30EnvironmentVariables
XDG_SESSION_CLASS: user
LANGUAGE: en_US
SHELL: /bin/bash
XDG_GREETER_DATA_DIR: /var/lib/lightdm/data/pi
DESKTOP_SESSION: LXDE-pi
GPG_AGENT_INFO: /run/user/1000/gnupg/S.gpg-agent:0:1
OLDPWD: /home/pi/Downloads/idea-IC-193.6494.35/bin
USER: pi
XDG_MENU_PREFIX: lxde-pi-
DESKTOP_STARTUP_ID: pcmanfm-1200-raspberrypi-"/home/pi/Downloads/idea-IC-193.6494.35/bin/idea.sh"-4_TIME5019151
XDG_CONFIG_HOME: /home/pi/.config
XDG_SEAT: seat0
SSH_AUTH_SOCK: /tmp/ssh-R6mnpfjMjpj3/agent.974
CLUTTER_IM_MODULE: scim
SAL_USE_VCLPLUGIN: gtk3
XDG_SESSION_PATH: /org/freedesktop/DisplayManager/Session0
LC_ALL: en_US
QT_QPA_PLATFORMTHEME: qt5ct
NO_AT_BRIDGE: 1
XDG_RUNTIME_DIR: /run/user/1000
XDG_SESSION_DESKTOP: lightdm-xsession
XDG_VTNR: 7
HOME: /home/pi
 */