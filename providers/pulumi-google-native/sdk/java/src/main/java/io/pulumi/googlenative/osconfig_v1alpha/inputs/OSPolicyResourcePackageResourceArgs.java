// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1alpha.enums.OSPolicyResourcePackageResourceDesiredState;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceAPTArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceDebArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceGooGetArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceMSIArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceRPMArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceYUMArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourcePackageResourceZypperArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A resource that manages a system package.
 * 
 */
public final class OSPolicyResourcePackageResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceArgs Empty = new OSPolicyResourcePackageResourceArgs();

    /**
     * A package managed by Apt.
     * 
     */
    @Import(name="apt")
      private final @Nullable Output<OSPolicyResourcePackageResourceAPTArgs> apt;

    public Output<OSPolicyResourcePackageResourceAPTArgs> getApt() {
        return this.apt == null ? Codegen.empty() : this.apt;
    }

    /**
     * A deb package file.
     * 
     */
    @Import(name="deb")
      private final @Nullable Output<OSPolicyResourcePackageResourceDebArgs> deb;

    public Output<OSPolicyResourcePackageResourceDebArgs> getDeb() {
        return this.deb == null ? Codegen.empty() : this.deb;
    }

    /**
     * The desired state the agent should maintain for this package.
     * 
     */
    @Import(name="desiredState", required=true)
      private final Output<OSPolicyResourcePackageResourceDesiredState> desiredState;

    public Output<OSPolicyResourcePackageResourceDesiredState> getDesiredState() {
        return this.desiredState;
    }

    /**
     * A package managed by GooGet.
     * 
     */
    @Import(name="googet")
      private final @Nullable Output<OSPolicyResourcePackageResourceGooGetArgs> googet;

    public Output<OSPolicyResourcePackageResourceGooGetArgs> getGooget() {
        return this.googet == null ? Codegen.empty() : this.googet;
    }

    /**
     * An MSI package.
     * 
     */
    @Import(name="msi")
      private final @Nullable Output<OSPolicyResourcePackageResourceMSIArgs> msi;

    public Output<OSPolicyResourcePackageResourceMSIArgs> getMsi() {
        return this.msi == null ? Codegen.empty() : this.msi;
    }

    /**
     * An rpm package file.
     * 
     */
    @Import(name="rpm")
      private final @Nullable Output<OSPolicyResourcePackageResourceRPMArgs> rpm;

    public Output<OSPolicyResourcePackageResourceRPMArgs> getRpm() {
        return this.rpm == null ? Codegen.empty() : this.rpm;
    }

    /**
     * A package managed by YUM.
     * 
     */
    @Import(name="yum")
      private final @Nullable Output<OSPolicyResourcePackageResourceYUMArgs> yum;

    public Output<OSPolicyResourcePackageResourceYUMArgs> getYum() {
        return this.yum == null ? Codegen.empty() : this.yum;
    }

    /**
     * A package managed by Zypper.
     * 
     */
    @Import(name="zypper")
      private final @Nullable Output<OSPolicyResourcePackageResourceZypperArgs> zypper;

    public Output<OSPolicyResourcePackageResourceZypperArgs> getZypper() {
        return this.zypper == null ? Codegen.empty() : this.zypper;
    }

    public OSPolicyResourcePackageResourceArgs(
        @Nullable Output<OSPolicyResourcePackageResourceAPTArgs> apt,
        @Nullable Output<OSPolicyResourcePackageResourceDebArgs> deb,
        Output<OSPolicyResourcePackageResourceDesiredState> desiredState,
        @Nullable Output<OSPolicyResourcePackageResourceGooGetArgs> googet,
        @Nullable Output<OSPolicyResourcePackageResourceMSIArgs> msi,
        @Nullable Output<OSPolicyResourcePackageResourceRPMArgs> rpm,
        @Nullable Output<OSPolicyResourcePackageResourceYUMArgs> yum,
        @Nullable Output<OSPolicyResourcePackageResourceZypperArgs> zypper) {
        this.apt = apt;
        this.deb = deb;
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.googet = googet;
        this.msi = msi;
        this.rpm = rpm;
        this.yum = yum;
        this.zypper = zypper;
    }

    private OSPolicyResourcePackageResourceArgs() {
        this.apt = Codegen.empty();
        this.deb = Codegen.empty();
        this.desiredState = Codegen.empty();
        this.googet = Codegen.empty();
        this.msi = Codegen.empty();
        this.rpm = Codegen.empty();
        this.yum = Codegen.empty();
        this.zypper = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OSPolicyResourcePackageResourceAPTArgs> apt;
        private @Nullable Output<OSPolicyResourcePackageResourceDebArgs> deb;
        private Output<OSPolicyResourcePackageResourceDesiredState> desiredState;
        private @Nullable Output<OSPolicyResourcePackageResourceGooGetArgs> googet;
        private @Nullable Output<OSPolicyResourcePackageResourceMSIArgs> msi;
        private @Nullable Output<OSPolicyResourcePackageResourceRPMArgs> rpm;
        private @Nullable Output<OSPolicyResourcePackageResourceYUMArgs> yum;
        private @Nullable Output<OSPolicyResourcePackageResourceZypperArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.deb = defaults.deb;
    	      this.desiredState = defaults.desiredState;
    	      this.googet = defaults.googet;
    	      this.msi = defaults.msi;
    	      this.rpm = defaults.rpm;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable Output<OSPolicyResourcePackageResourceAPTArgs> apt) {
            this.apt = apt;
            return this;
        }
        public Builder apt(@Nullable OSPolicyResourcePackageResourceAPTArgs apt) {
            this.apt = Codegen.ofNullable(apt);
            return this;
        }
        public Builder deb(@Nullable Output<OSPolicyResourcePackageResourceDebArgs> deb) {
            this.deb = deb;
            return this;
        }
        public Builder deb(@Nullable OSPolicyResourcePackageResourceDebArgs deb) {
            this.deb = Codegen.ofNullable(deb);
            return this;
        }
        public Builder desiredState(Output<OSPolicyResourcePackageResourceDesiredState> desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }
        public Builder desiredState(OSPolicyResourcePackageResourceDesiredState desiredState) {
            this.desiredState = Output.of(Objects.requireNonNull(desiredState));
            return this;
        }
        public Builder googet(@Nullable Output<OSPolicyResourcePackageResourceGooGetArgs> googet) {
            this.googet = googet;
            return this;
        }
        public Builder googet(@Nullable OSPolicyResourcePackageResourceGooGetArgs googet) {
            this.googet = Codegen.ofNullable(googet);
            return this;
        }
        public Builder msi(@Nullable Output<OSPolicyResourcePackageResourceMSIArgs> msi) {
            this.msi = msi;
            return this;
        }
        public Builder msi(@Nullable OSPolicyResourcePackageResourceMSIArgs msi) {
            this.msi = Codegen.ofNullable(msi);
            return this;
        }
        public Builder rpm(@Nullable Output<OSPolicyResourcePackageResourceRPMArgs> rpm) {
            this.rpm = rpm;
            return this;
        }
        public Builder rpm(@Nullable OSPolicyResourcePackageResourceRPMArgs rpm) {
            this.rpm = Codegen.ofNullable(rpm);
            return this;
        }
        public Builder yum(@Nullable Output<OSPolicyResourcePackageResourceYUMArgs> yum) {
            this.yum = yum;
            return this;
        }
        public Builder yum(@Nullable OSPolicyResourcePackageResourceYUMArgs yum) {
            this.yum = Codegen.ofNullable(yum);
            return this;
        }
        public Builder zypper(@Nullable Output<OSPolicyResourcePackageResourceZypperArgs> zypper) {
            this.zypper = zypper;
            return this;
        }
        public Builder zypper(@Nullable OSPolicyResourcePackageResourceZypperArgs zypper) {
            this.zypper = Codegen.ofNullable(zypper);
            return this;
        }        public OSPolicyResourcePackageResourceArgs build() {
            return new OSPolicyResourcePackageResourceArgs(apt, deb, desiredState, googet, msi, rpm, yum, zypper);
        }
    }
}
