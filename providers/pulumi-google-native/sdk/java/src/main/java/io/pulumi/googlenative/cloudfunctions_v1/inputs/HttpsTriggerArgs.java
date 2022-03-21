// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudfunctions_v1.enums.HttpsTriggerSecurityLevel;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes HttpsTrigger, could be used to connect web hooks to function.
 * 
 */
public final class HttpsTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpsTriggerArgs Empty = new HttpsTriggerArgs();

    /**
     * The security level for the function.
     * 
     */
    @Import(name="securityLevel")
      private final @Nullable Output<HttpsTriggerSecurityLevel> securityLevel;

    public Output<HttpsTriggerSecurityLevel> getSecurityLevel() {
        return this.securityLevel == null ? Output.empty() : this.securityLevel;
    }

    public HttpsTriggerArgs(@Nullable Output<HttpsTriggerSecurityLevel> securityLevel) {
        this.securityLevel = securityLevel;
    }

    private HttpsTriggerArgs() {
        this.securityLevel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpsTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HttpsTriggerSecurityLevel> securityLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpsTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityLevel = defaults.securityLevel;
        }

        public Builder securityLevel(@Nullable Output<HttpsTriggerSecurityLevel> securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Builder securityLevel(@Nullable HttpsTriggerSecurityLevel securityLevel) {
            this.securityLevel = Output.ofNullable(securityLevel);
            return this;
        }        public HttpsTriggerArgs build() {
            return new HttpsTriggerArgs(securityLevel);
        }
    }
}
