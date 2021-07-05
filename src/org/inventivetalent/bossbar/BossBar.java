/*
 * Copyright 2015-2016 inventivetalent. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ''AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and contributors and should not be interpreted as representing official policies,
 *  either expressed or implied, of anybody else.
 */

package org.inventivetalent.bossbar;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Collection;

public interface BossBar {

	/**
	 * @return The players which can see the BossBar
	 */
	Collection<? extends Player> getPlayers();

	/**
	 * Add a player to this BossBar
	 *
	 * @param player {@link Player} to add
	 */
	void addPlayer(Player player);

	/**
	 * Remove a player from this BossBar
	 *
	 * @param player {@link Player} to remove
	 */
	void removePlayer(Player player);

	/**
	 * @return the {@link org.inventivetalent.bossbar.BossBarAPI.Color}
	 */
	BossBarAPI.Color getColor();

	/**
	 * @param color the new {@link org.inventivetalent.bossbar.BossBarAPI.Color}
	 */
	void setColor(BossBarAPI.Color color);

	/**
	 * @return the {@link org.inventivetalent.bossbar.BossBarAPI.Style}
	 */
	BossBarAPI.Style getStyle();

	/**
	 * @param style the new {@link org.inventivetalent.bossbar.BossBarAPI.Style}
	 */
	void setStyle(BossBarAPI.Style style);

	/**
	 * Modify a property
	 *
	 * @param property {@link org.inventivetalent.bossbar.BossBarAPI.Property}
	 * @param flag     whether to enable the property
	 */
	void setProperty(BossBarAPI.Property property, boolean flag);

	/**
	 * @return the message
	 */
	String getMessage();

	/**
	 * @param flag whether the BossBar is visible
	 */
	void setVisible(boolean flag);

	/**
	 * @return whether the BossBar is visible
	 */
	boolean isVisible();

	/**
	 * @return the progress (0.0 - 1.0)
	 */
	float getProgress();

	/**
	 * @param progress the new progress (0.0 - 1.0)
	 */
	void setProgress(float progress);

	@Deprecated
	float getMaxHealth();

	@Deprecated
	void setHealth(float percentage);

	@Deprecated
	float getHealth();

	@Deprecated
	void setMessage(String message);

	@Deprecated
	Player getReceiver();

	@Deprecated
	Location getLocation();

	@Deprecated
	void updateMovement();
}
