// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryApt;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryGoo;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryYum;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesPackageRepositoryZypper;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestPoliciesPackageRepository {
    /**
     * An Apt Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryApt apt;
    /**
     * A Goo Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryGoo goo;
    /**
     * A Yum Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryYum yum;
    /**
     * A Zypper Repository.
     * Structure is documented below.
     * 
     */
    private final @Nullable GuestPoliciesPackageRepositoryZypper zypper;

    @CustomType.Constructor
    private GuestPoliciesPackageRepository(
        @CustomType.Parameter("apt") @Nullable GuestPoliciesPackageRepositoryApt apt,
        @CustomType.Parameter("goo") @Nullable GuestPoliciesPackageRepositoryGoo goo,
        @CustomType.Parameter("yum") @Nullable GuestPoliciesPackageRepositoryYum yum,
        @CustomType.Parameter("zypper") @Nullable GuestPoliciesPackageRepositoryZypper zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    /**
     * An Apt Repository.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesPackageRepositoryApt> getApt() {
        return Optional.ofNullable(this.apt);
    }
    /**
     * A Goo Repository.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesPackageRepositoryGoo> getGoo() {
        return Optional.ofNullable(this.goo);
    }
    /**
     * A Yum Repository.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesPackageRepositoryYum> getYum() {
        return Optional.ofNullable(this.yum);
    }
    /**
     * A Zypper Repository.
     * Structure is documented below.
     * 
    */
    public Optional<GuestPoliciesPackageRepositoryZypper> getZypper() {
        return Optional.ofNullable(this.zypper);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GuestPoliciesPackageRepositoryApt apt;
        private @Nullable GuestPoliciesPackageRepositoryGoo goo;
        private @Nullable GuestPoliciesPackageRepositoryYum yum;
        private @Nullable GuestPoliciesPackageRepositoryZypper zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable GuestPoliciesPackageRepositoryApt apt) {
            this.apt = apt;
            return this;
        }
        public Builder goo(@Nullable GuestPoliciesPackageRepositoryGoo goo) {
            this.goo = goo;
            return this;
        }
        public Builder yum(@Nullable GuestPoliciesPackageRepositoryYum yum) {
            this.yum = yum;
            return this;
        }
        public Builder zypper(@Nullable GuestPoliciesPackageRepositoryZypper zypper) {
            this.zypper = zypper;
            return this;
        }        public GuestPoliciesPackageRepository build() {
            return new GuestPoliciesPackageRepository(apt, goo, yum, zypper);
        }
    }
}
