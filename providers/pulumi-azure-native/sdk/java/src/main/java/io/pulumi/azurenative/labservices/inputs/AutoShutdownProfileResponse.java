// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile for how to handle shutting down virtual machines.
 * 
 */
public final class AutoShutdownProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoShutdownProfileResponse Empty = new AutoShutdownProfileResponse();

    /**
     * The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    @InputImport(name="disconnectDelay")
      private final @Nullable String disconnectDelay;

    public Optional<String> getDisconnectDelay() {
        return this.disconnectDelay == null ? Optional.empty() : Optional.ofNullable(this.disconnectDelay);
    }

    /**
     * The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    @InputImport(name="idleDelay")
      private final @Nullable String idleDelay;

    public Optional<String> getIdleDelay() {
        return this.idleDelay == null ? Optional.empty() : Optional.ofNullable(this.idleDelay);
    }

    /**
     * The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    @InputImport(name="noConnectDelay")
      private final @Nullable String noConnectDelay;

    public Optional<String> getNoConnectDelay() {
        return this.noConnectDelay == null ? Optional.empty() : Optional.ofNullable(this.noConnectDelay);
    }

    /**
     * Whether shutdown on disconnect is enabled
     * 
     */
    @InputImport(name="shutdownOnDisconnect")
      private final @Nullable String shutdownOnDisconnect;

    public Optional<String> getShutdownOnDisconnect() {
        return this.shutdownOnDisconnect == null ? Optional.empty() : Optional.ofNullable(this.shutdownOnDisconnect);
    }

    /**
     * Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    @InputImport(name="shutdownOnIdle")
      private final @Nullable String shutdownOnIdle;

    public Optional<String> getShutdownOnIdle() {
        return this.shutdownOnIdle == null ? Optional.empty() : Optional.ofNullable(this.shutdownOnIdle);
    }

    /**
     * Whether a VM will get shutdown when it hasn't been connected to after a period of time.
     * 
     */
    @InputImport(name="shutdownWhenNotConnected")
      private final @Nullable String shutdownWhenNotConnected;

    public Optional<String> getShutdownWhenNotConnected() {
        return this.shutdownWhenNotConnected == null ? Optional.empty() : Optional.ofNullable(this.shutdownWhenNotConnected);
    }

    public AutoShutdownProfileResponse(
        @Nullable String disconnectDelay,
        @Nullable String idleDelay,
        @Nullable String noConnectDelay,
        @Nullable String shutdownOnDisconnect,
        @Nullable String shutdownOnIdle,
        @Nullable String shutdownWhenNotConnected) {
        this.disconnectDelay = disconnectDelay;
        this.idleDelay = idleDelay;
        this.noConnectDelay = noConnectDelay;
        this.shutdownOnDisconnect = shutdownOnDisconnect == null ? "Disabled" : shutdownOnDisconnect;
        this.shutdownOnIdle = shutdownOnIdle == null ? "None" : shutdownOnIdle;
        this.shutdownWhenNotConnected = shutdownWhenNotConnected == null ? "Disabled" : shutdownWhenNotConnected;
    }

    private AutoShutdownProfileResponse() {
        this.disconnectDelay = null;
        this.idleDelay = null;
        this.noConnectDelay = null;
        this.shutdownOnDisconnect = null;
        this.shutdownOnIdle = null;
        this.shutdownWhenNotConnected = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoShutdownProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String disconnectDelay;
        private @Nullable String idleDelay;
        private @Nullable String noConnectDelay;
        private @Nullable String shutdownOnDisconnect;
        private @Nullable String shutdownOnIdle;
        private @Nullable String shutdownWhenNotConnected;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoShutdownProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disconnectDelay = defaults.disconnectDelay;
    	      this.idleDelay = defaults.idleDelay;
    	      this.noConnectDelay = defaults.noConnectDelay;
    	      this.shutdownOnDisconnect = defaults.shutdownOnDisconnect;
    	      this.shutdownOnIdle = defaults.shutdownOnIdle;
    	      this.shutdownWhenNotConnected = defaults.shutdownWhenNotConnected;
        }

        public Builder setDisconnectDelay(@Nullable String disconnectDelay) {
            this.disconnectDelay = disconnectDelay;
            return this;
        }

        public Builder setIdleDelay(@Nullable String idleDelay) {
            this.idleDelay = idleDelay;
            return this;
        }

        public Builder setNoConnectDelay(@Nullable String noConnectDelay) {
            this.noConnectDelay = noConnectDelay;
            return this;
        }

        public Builder setShutdownOnDisconnect(@Nullable String shutdownOnDisconnect) {
            this.shutdownOnDisconnect = shutdownOnDisconnect;
            return this;
        }

        public Builder setShutdownOnIdle(@Nullable String shutdownOnIdle) {
            this.shutdownOnIdle = shutdownOnIdle;
            return this;
        }

        public Builder setShutdownWhenNotConnected(@Nullable String shutdownWhenNotConnected) {
            this.shutdownWhenNotConnected = shutdownWhenNotConnected;
            return this;
        }
        public AutoShutdownProfileResponse build() {
            return new AutoShutdownProfileResponse(disconnectDelay, idleDelay, noConnectDelay, shutdownOnDisconnect, shutdownOnIdle, shutdownWhenNotConnected);
        }
    }
}
