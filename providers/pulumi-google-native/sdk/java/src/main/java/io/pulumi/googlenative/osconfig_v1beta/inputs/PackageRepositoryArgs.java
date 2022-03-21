// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1beta.inputs.AptRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.GooRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.YumRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.ZypperRepositoryArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A package repository.
 * 
 */
public final class PackageRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageRepositoryArgs Empty = new PackageRepositoryArgs();

    /**
     * An Apt Repository.
     * 
     */
    @Import(name="apt")
      private final @Nullable Output<AptRepositoryArgs> apt;

    public Output<AptRepositoryArgs> getApt() {
        return this.apt == null ? Output.empty() : this.apt;
    }

    /**
     * A Goo Repository.
     * 
     */
    @Import(name="goo")
      private final @Nullable Output<GooRepositoryArgs> goo;

    public Output<GooRepositoryArgs> getGoo() {
        return this.goo == null ? Output.empty() : this.goo;
    }

    /**
     * A Yum Repository.
     * 
     */
    @Import(name="yum")
      private final @Nullable Output<YumRepositoryArgs> yum;

    public Output<YumRepositoryArgs> getYum() {
        return this.yum == null ? Output.empty() : this.yum;
    }

    /**
     * A Zypper Repository.
     * 
     */
    @Import(name="zypper")
      private final @Nullable Output<ZypperRepositoryArgs> zypper;

    public Output<ZypperRepositoryArgs> getZypper() {
        return this.zypper == null ? Output.empty() : this.zypper;
    }

    public PackageRepositoryArgs(
        @Nullable Output<AptRepositoryArgs> apt,
        @Nullable Output<GooRepositoryArgs> goo,
        @Nullable Output<YumRepositoryArgs> yum,
        @Nullable Output<ZypperRepositoryArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    private PackageRepositoryArgs() {
        this.apt = Output.empty();
        this.goo = Output.empty();
        this.yum = Output.empty();
        this.zypper = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AptRepositoryArgs> apt;
        private @Nullable Output<GooRepositoryArgs> goo;
        private @Nullable Output<YumRepositoryArgs> yum;
        private @Nullable Output<ZypperRepositoryArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable Output<AptRepositoryArgs> apt) {
            this.apt = apt;
            return this;
        }
        public Builder apt(@Nullable AptRepositoryArgs apt) {
            this.apt = Output.ofNullable(apt);
            return this;
        }
        public Builder goo(@Nullable Output<GooRepositoryArgs> goo) {
            this.goo = goo;
            return this;
        }
        public Builder goo(@Nullable GooRepositoryArgs goo) {
            this.goo = Output.ofNullable(goo);
            return this;
        }
        public Builder yum(@Nullable Output<YumRepositoryArgs> yum) {
            this.yum = yum;
            return this;
        }
        public Builder yum(@Nullable YumRepositoryArgs yum) {
            this.yum = Output.ofNullable(yum);
            return this;
        }
        public Builder zypper(@Nullable Output<ZypperRepositoryArgs> zypper) {
            this.zypper = zypper;
            return this;
        }
        public Builder zypper(@Nullable ZypperRepositoryArgs zypper) {
            this.zypper = Output.ofNullable(zypper);
            return this;
        }        public PackageRepositoryArgs build() {
            return new PackageRepositoryArgs(apt, goo, yum, zypper);
        }
    }
}
