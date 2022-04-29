// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutonomousDatabaseConnectionStringProfile {
    /**
     * @return Consumer group used by the connection.
     * 
     */
    private final @Nullable String consumerGroup;
    /**
     * @return (Updatable) The user-friendly name for the Autonomous Database. The name does not have to be unique.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return Host format used in connection string.
     * 
     */
    private final @Nullable String hostFormat;
    /**
     * @return Protocol used by the connection.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return Specifies whether the listener performs a direct hand-off of the session, or redirects the session. In RAC deployments where SCAN is used, sessions are redirected to a Node VIP. Use `DIRECT` for direct hand-offs. Use `REDIRECT` to redirect the session.
     * 
     */
    private final @Nullable String sessionMode;
    /**
     * @return Specifies whether the connection string is using the long (`LONG`), Easy Connect (`EZCONNECT`), or Easy Connect Plus (`EZCONNECTPLUS`) format. Autonomous Databases on shared Exadata infrastructure always use the long format.
     * 
     */
    private final @Nullable String syntaxFormat;
    /**
     * @return Specifies whether the TLS handshake is using one-way (`SERVER`) or mutual (`MUTUAL`) authentication.
     * 
     */
    private final @Nullable String tlsAuthentication;
    /**
     * @return Connection string value.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private AutonomousDatabaseConnectionStringProfile(
        @CustomType.Parameter("consumerGroup") @Nullable String consumerGroup,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("hostFormat") @Nullable String hostFormat,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("sessionMode") @Nullable String sessionMode,
        @CustomType.Parameter("syntaxFormat") @Nullable String syntaxFormat,
        @CustomType.Parameter("tlsAuthentication") @Nullable String tlsAuthentication,
        @CustomType.Parameter("value") @Nullable String value) {
        this.consumerGroup = consumerGroup;
        this.displayName = displayName;
        this.hostFormat = hostFormat;
        this.protocol = protocol;
        this.sessionMode = sessionMode;
        this.syntaxFormat = syntaxFormat;
        this.tlsAuthentication = tlsAuthentication;
        this.value = value;
    }

    /**
     * @return Consumer group used by the connection.
     * 
     */
    public Optional<String> consumerGroup() {
        return Optional.ofNullable(this.consumerGroup);
    }
    /**
     * @return (Updatable) The user-friendly name for the Autonomous Database. The name does not have to be unique.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Host format used in connection string.
     * 
     */
    public Optional<String> hostFormat() {
        return Optional.ofNullable(this.hostFormat);
    }
    /**
     * @return Protocol used by the connection.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Specifies whether the listener performs a direct hand-off of the session, or redirects the session. In RAC deployments where SCAN is used, sessions are redirected to a Node VIP. Use `DIRECT` for direct hand-offs. Use `REDIRECT` to redirect the session.
     * 
     */
    public Optional<String> sessionMode() {
        return Optional.ofNullable(this.sessionMode);
    }
    /**
     * @return Specifies whether the connection string is using the long (`LONG`), Easy Connect (`EZCONNECT`), or Easy Connect Plus (`EZCONNECTPLUS`) format. Autonomous Databases on shared Exadata infrastructure always use the long format.
     * 
     */
    public Optional<String> syntaxFormat() {
        return Optional.ofNullable(this.syntaxFormat);
    }
    /**
     * @return Specifies whether the TLS handshake is using one-way (`SERVER`) or mutual (`MUTUAL`) authentication.
     * 
     */
    public Optional<String> tlsAuthentication() {
        return Optional.ofNullable(this.tlsAuthentication);
    }
    /**
     * @return Connection string value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutonomousDatabaseConnectionStringProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consumerGroup;
        private @Nullable String displayName;
        private @Nullable String hostFormat;
        private @Nullable String protocol;
        private @Nullable String sessionMode;
        private @Nullable String syntaxFormat;
        private @Nullable String tlsAuthentication;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AutonomousDatabaseConnectionStringProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.displayName = defaults.displayName;
    	      this.hostFormat = defaults.hostFormat;
    	      this.protocol = defaults.protocol;
    	      this.sessionMode = defaults.sessionMode;
    	      this.syntaxFormat = defaults.syntaxFormat;
    	      this.tlsAuthentication = defaults.tlsAuthentication;
    	      this.value = defaults.value;
        }

        public Builder consumerGroup(@Nullable String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder hostFormat(@Nullable String hostFormat) {
            this.hostFormat = hostFormat;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder sessionMode(@Nullable String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public Builder syntaxFormat(@Nullable String syntaxFormat) {
            this.syntaxFormat = syntaxFormat;
            return this;
        }
        public Builder tlsAuthentication(@Nullable String tlsAuthentication) {
            this.tlsAuthentication = tlsAuthentication;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public AutonomousDatabaseConnectionStringProfile build() {
            return new AutonomousDatabaseConnectionStringProfile(consumerGroup, displayName, hostFormat, protocol, sessionMode, syntaxFormat, tlsAuthentication, value);
        }
    }
}
