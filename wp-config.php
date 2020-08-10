<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/support/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'FormationWEB' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', '' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

if ( !defined('WP_CLI') ) {
    define( 'WP_SITEURL', $_SERVER['REQUEST_SCHEME'] . '://' . $_SERVER['HTTP_HOST'] );
    define( 'WP_HOME',    $_SERVER['REQUEST_SCHEME'] . '://' . $_SERVER['HTTP_HOST'] );
}



/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'kiFnqaQOG0R5dCX74YumdQZI0mcgyFdJObXHrZHw8n7LtwhDnOGyKiP5TccwRwRg' );
define( 'SECURE_AUTH_KEY',  'bOUtClATtfc06lj3xHdsdePvxej5UkMqtCVKBWjrTzE9jFpgMwkI304kXYJDpwbx' );
define( 'LOGGED_IN_KEY',    'DbvoUdirGO9FTe3LrbRfn9xkNqeWTOKjqlNCzRWnRqrVKjfP2JMj28qZnDGlVxAY' );
define( 'NONCE_KEY',        'UGTolCUcZrQKnOjFtfAu3InNIxqoa4qfjeuqugLkYZqRmjUmDdRtS7Kc3mzSfupP' );
define( 'AUTH_SALT',        'hGkCXX4zt4JCa4hsRxZP9VYQ95XANU7nszMNAuaD6DZudBce5eT3sa8trokNDBnA' );
define( 'SECURE_AUTH_SALT', '3CQGm5juAwlDcV5JEI2CYBE0zeQJScNcxJwlqYSofzNZ551yKsHjZAL1MCvbfoZS' );
define( 'LOGGED_IN_SALT',   'RpBcG10PJYqeBr8Yx5B1d3zRtI02NDpzeKjTu7EVahalapkJeGbpJimAiD463WFK' );
define( 'NONCE_SALT',       'aJlgv4CM6gxUQfDw2ySC1u1bzX84w5Kfx8deNrFZhcGQbaRnM1U3uEm0cNzp4CRf' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/support/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
