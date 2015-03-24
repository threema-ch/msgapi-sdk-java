/*
 * $Id$
 *
 * Copyright (c) 2014 Threema GmbH. All rights reserved.
 *
 * This software is intended for use by Threema Message API customers only. Distribution prohibited.
 */

package ch.threema.apitool;

/**
 * Abstract base class of messages that can be sent with end-to-end encryption via Threema.
 */
public abstract class ThreemaMessage {

	protected abstract int getTypeCode();
}
