// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceAptRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceGooRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceYumRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceRepositoryResourceZypperRepositoryArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A resource that manages a package repository.
 * 
 */
public final class OSPolicyResourceRepositoryResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceRepositoryResourceArgs Empty = new OSPolicyResourceRepositoryResourceArgs();

    /**
     * An Apt Repository.
     * 
     */
    @Import(name="apt")
      private final @Nullable Output<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt;

    public Output<OSPolicyResourceRepositoryResourceAptRepositoryArgs> getApt() {
        return this.apt == null ? Codegen.empty() : this.apt;
    }

    /**
     * A Goo Repository.
     * 
     */
    @Import(name="goo")
      private final @Nullable Output<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo;

    public Output<OSPolicyResourceRepositoryResourceGooRepositoryArgs> getGoo() {
        return this.goo == null ? Codegen.empty() : this.goo;
    }

    /**
     * A Yum Repository.
     * 
     */
    @Import(name="yum")
      private final @Nullable Output<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum;

    public Output<OSPolicyResourceRepositoryResourceYumRepositoryArgs> getYum() {
        return this.yum == null ? Codegen.empty() : this.yum;
    }

    /**
     * A Zypper Repository.
     * 
     */
    @Import(name="zypper")
      private final @Nullable Output<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper;

    public Output<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> getZypper() {
        return this.zypper == null ? Codegen.empty() : this.zypper;
    }

    public OSPolicyResourceRepositoryResourceArgs(
        @Nullable Output<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt,
        @Nullable Output<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo,
        @Nullable Output<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum,
        @Nullable Output<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    private OSPolicyResourceRepositoryResourceArgs() {
        this.apt = Codegen.empty();
        this.goo = Codegen.empty();
        this.yum = Codegen.empty();
        this.zypper = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt;
        private @Nullable Output<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo;
        private @Nullable Output<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum;
        private @Nullable Output<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable Output<OSPolicyResourceRepositoryResourceAptRepositoryArgs> apt) {
            this.apt = apt;
            return this;
        }
        public Builder apt(@Nullable OSPolicyResourceRepositoryResourceAptRepositoryArgs apt) {
            this.apt = Codegen.ofNullable(apt);
            return this;
        }
        public Builder goo(@Nullable Output<OSPolicyResourceRepositoryResourceGooRepositoryArgs> goo) {
            this.goo = goo;
            return this;
        }
        public Builder goo(@Nullable OSPolicyResourceRepositoryResourceGooRepositoryArgs goo) {
            this.goo = Codegen.ofNullable(goo);
            return this;
        }
        public Builder yum(@Nullable Output<OSPolicyResourceRepositoryResourceYumRepositoryArgs> yum) {
            this.yum = yum;
            return this;
        }
        public Builder yum(@Nullable OSPolicyResourceRepositoryResourceYumRepositoryArgs yum) {
            this.yum = Codegen.ofNullable(yum);
            return this;
        }
        public Builder zypper(@Nullable Output<OSPolicyResourceRepositoryResourceZypperRepositoryArgs> zypper) {
            this.zypper = zypper;
            return this;
        }
        public Builder zypper(@Nullable OSPolicyResourceRepositoryResourceZypperRepositoryArgs zypper) {
            this.zypper = Codegen.ofNullable(zypper);
            return this;
        }        public OSPolicyResourceRepositoryResourceArgs build() {
            return new OSPolicyResourceRepositoryResourceArgs(apt, goo, yum, zypper);
        }
    }
}
