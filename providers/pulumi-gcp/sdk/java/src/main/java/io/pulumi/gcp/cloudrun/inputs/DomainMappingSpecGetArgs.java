// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingSpecGetArgs Empty = new DomainMappingSpecGetArgs();

    /**
     * The mode of the certificate.
     * Default value is `AUTOMATIC`.
     * Possible values are `NONE` and `AUTOMATIC`.
     * 
     */
    @Import(name="certificateMode")
      private final @Nullable Output<String> certificateMode;

    public Output<String> getCertificateMode() {
        return this.certificateMode == null ? Output.empty() : this.certificateMode;
    }

    /**
     * If set, the mapping will override any mapping set before this spec was set.
     * It is recommended that the user leaves this empty to receive an error
     * warning about a potential conflict and only set it once the respective UI
     * has given such a warning.
     * 
     */
    @Import(name="forceOverride")
      private final @Nullable Output<Boolean> forceOverride;

    public Output<Boolean> getForceOverride() {
        return this.forceOverride == null ? Output.empty() : this.forceOverride;
    }

    /**
     * The name of the Cloud Run Service that this DomainMapping applies to.
     * The route must exist.
     * 
     */
    @Import(name="routeName", required=true)
      private final Output<String> routeName;

    public Output<String> getRouteName() {
        return this.routeName;
    }

    public DomainMappingSpecGetArgs(
        @Nullable Output<String> certificateMode,
        @Nullable Output<Boolean> forceOverride,
        Output<String> routeName) {
        this.certificateMode = certificateMode;
        this.forceOverride = forceOverride;
        this.routeName = Objects.requireNonNull(routeName, "expected parameter 'routeName' to be non-null");
    }

    private DomainMappingSpecGetArgs() {
        this.certificateMode = Output.empty();
        this.forceOverride = Output.empty();
        this.routeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateMode;
        private @Nullable Output<Boolean> forceOverride;
        private Output<String> routeName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMode = defaults.certificateMode;
    	      this.forceOverride = defaults.forceOverride;
    	      this.routeName = defaults.routeName;
        }

        public Builder certificateMode(@Nullable Output<String> certificateMode) {
            this.certificateMode = certificateMode;
            return this;
        }
        public Builder certificateMode(@Nullable String certificateMode) {
            this.certificateMode = Output.ofNullable(certificateMode);
            return this;
        }
        public Builder forceOverride(@Nullable Output<Boolean> forceOverride) {
            this.forceOverride = forceOverride;
            return this;
        }
        public Builder forceOverride(@Nullable Boolean forceOverride) {
            this.forceOverride = Output.ofNullable(forceOverride);
            return this;
        }
        public Builder routeName(Output<String> routeName) {
            this.routeName = Objects.requireNonNull(routeName);
            return this;
        }
        public Builder routeName(String routeName) {
            this.routeName = Output.of(Objects.requireNonNull(routeName));
            return this;
        }        public DomainMappingSpecGetArgs build() {
            return new DomainMappingSpecGetArgs(certificateMode, forceOverride, routeName);
        }
    }
}
