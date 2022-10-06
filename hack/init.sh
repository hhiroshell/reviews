#!/usr/bin/env bash

# initialize sdkman
export SDKMAN_DIR="$HOME/.sdkman"
[[ -s "$HOME/.sdkman/bin/sdkman-init.sh" ]] && source "$HOME/.sdkman/bin/sdkman-init.sh"

# tomcat environment variables
export JAVA_HOME=$(sdk home java current)
export CATALINA_HOME=$(sdk home tomcat current)
export CATALINA_BASE=$(pwd)/../catalina-base