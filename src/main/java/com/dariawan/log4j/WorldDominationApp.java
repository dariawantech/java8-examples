/**
 * Code Examples in JDK 8 v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to:
 * # Share - copy and redistribute the material in any medium or format
 * # Adapt - remix, transform, and build upon the material for any purpose,
 *   even commercially.
 *
 * The licensor cannot revoke these freedoms
 * as long as you follow the license terms.
 *
 * License terms:
 * # Attribution - You must give appropriate credit, provide a link to the
 *   license, and indicate if changes were made. You may do so in any
 *   reasonable manner, but not in any way that suggests the licensor
 *   endorses you or your use.
 * # ShareAlike - If you remix, transform, or build upon the material, you must
 *   distribute your contributions under the same license as the original.
 * # No additional restrictions - You may not apply legal terms or
 *   technological measures that legally restrict others from doing anything the
 *   license permits.
 *
 * Notices:
 * # You do not have to comply with the license for elements of the material in
 *   the public domain or where your use is permitted by an applicable exception
 *   or limitation.
 * # No warranties are given. The license may not give you all of
 *   the permissions necessary for your intended use. For example, other rights
 *   such as publicity, privacy, or moral rights may limit how you use
 *   the material.
 *
 * You may obtain a copy of the License at
 *   https://creativecommons.org/licenses/by-sa/4.0/
 *   https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.log4j;

import com.dariawan.log4j.controller.WorldDominationController;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class WorldDominationApp {
 
    private static final Logger LOGGER = Logger.getLogger(WorldDominationApp.class);
    
    public static void main(String[] args) {
        // start...
        LOGGER.trace("This is a TRACE message");
        LOGGER.debug("This is a DEBUG message");
        LOGGER.info("This is an INFO message");
        LOGGER.warn("This is a WARN message");
        LOGGER.error("This is an ERROR message");
        LOGGER.fatal("This is a FATAL message");
        
        LOGGER.log(Level.DEBUG, "Method WorldDominationApp.main() start");
        
        WorldDominationController controller= WorldDominationController.getInstance();
        controller.takeOverTheWorld();
        
        LOGGER.log(Level.DEBUG, "Method WorldDominationApp.main() completed");
    }
}
