// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PackageVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageVersionArgs Empty = new PackageVersionArgs();

    @InputImport(name="markLatest")
      private final @Nullable Input<Boolean> markLatest;

    public Input<Boolean> getMarkLatest() {
        return this.markLatest == null ? Input.empty() : this.markLatest;
    }

    @InputImport(name="ownerAccount")
      private final @Nullable Input<String> ownerAccount;

    public Input<String> getOwnerAccount() {
        return this.ownerAccount == null ? Input.empty() : this.ownerAccount;
    }

    @InputImport(name="packageId", required=true)
      private final Input<String> packageId;

    public Input<String> getPackageId() {
        return this.packageId;
    }

    @InputImport(name="packageVersion", required=true)
      private final Input<String> packageVersion;

    public Input<String> getPackageVersion() {
        return this.packageVersion;
    }

    @InputImport(name="patchVersion", required=true)
      private final Input<String> patchVersion;

    public Input<String> getPatchVersion() {
        return this.patchVersion;
    }

    @InputImport(name="updatedLatestPatchVersion")
      private final @Nullable Input<String> updatedLatestPatchVersion;

    public Input<String> getUpdatedLatestPatchVersion() {
        return this.updatedLatestPatchVersion == null ? Input.empty() : this.updatedLatestPatchVersion;
    }

    public PackageVersionArgs(
        @Nullable Input<Boolean> markLatest,
        @Nullable Input<String> ownerAccount,
        Input<String> packageId,
        Input<String> packageVersion,
        Input<String> patchVersion,
        @Nullable Input<String> updatedLatestPatchVersion) {
        this.markLatest = markLatest;
        this.ownerAccount = ownerAccount;
        this.packageId = Objects.requireNonNull(packageId, "expected parameter 'packageId' to be non-null");
        this.packageVersion = Objects.requireNonNull(packageVersion, "expected parameter 'packageVersion' to be non-null");
        this.patchVersion = Objects.requireNonNull(patchVersion, "expected parameter 'patchVersion' to be non-null");
        this.updatedLatestPatchVersion = updatedLatestPatchVersion;
    }

    private PackageVersionArgs() {
        this.markLatest = Input.empty();
        this.ownerAccount = Input.empty();
        this.packageId = Input.empty();
        this.packageVersion = Input.empty();
        this.patchVersion = Input.empty();
        this.updatedLatestPatchVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> markLatest;
        private @Nullable Input<String> ownerAccount;
        private Input<String> packageId;
        private Input<String> packageVersion;
        private Input<String> patchVersion;
        private @Nullable Input<String> updatedLatestPatchVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.markLatest = defaults.markLatest;
    	      this.ownerAccount = defaults.ownerAccount;
    	      this.packageId = defaults.packageId;
    	      this.packageVersion = defaults.packageVersion;
    	      this.patchVersion = defaults.patchVersion;
    	      this.updatedLatestPatchVersion = defaults.updatedLatestPatchVersion;
        }

        public Builder setMarkLatest(@Nullable Input<Boolean> markLatest) {
            this.markLatest = markLatest;
            return this;
        }

        public Builder setMarkLatest(@Nullable Boolean markLatest) {
            this.markLatest = Input.ofNullable(markLatest);
            return this;
        }

        public Builder setOwnerAccount(@Nullable Input<String> ownerAccount) {
            this.ownerAccount = ownerAccount;
            return this;
        }

        public Builder setOwnerAccount(@Nullable String ownerAccount) {
            this.ownerAccount = Input.ofNullable(ownerAccount);
            return this;
        }

        public Builder setPackageId(Input<String> packageId) {
            this.packageId = Objects.requireNonNull(packageId);
            return this;
        }

        public Builder setPackageId(String packageId) {
            this.packageId = Input.of(Objects.requireNonNull(packageId));
            return this;
        }

        public Builder setPackageVersion(Input<String> packageVersion) {
            this.packageVersion = Objects.requireNonNull(packageVersion);
            return this;
        }

        public Builder setPackageVersion(String packageVersion) {
            this.packageVersion = Input.of(Objects.requireNonNull(packageVersion));
            return this;
        }

        public Builder setPatchVersion(Input<String> patchVersion) {
            this.patchVersion = Objects.requireNonNull(patchVersion);
            return this;
        }

        public Builder setPatchVersion(String patchVersion) {
            this.patchVersion = Input.of(Objects.requireNonNull(patchVersion));
            return this;
        }

        public Builder setUpdatedLatestPatchVersion(@Nullable Input<String> updatedLatestPatchVersion) {
            this.updatedLatestPatchVersion = updatedLatestPatchVersion;
            return this;
        }

        public Builder setUpdatedLatestPatchVersion(@Nullable String updatedLatestPatchVersion) {
            this.updatedLatestPatchVersion = Input.ofNullable(updatedLatestPatchVersion);
            return this;
        }
        public PackageVersionArgs build() {
            return new PackageVersionArgs(markLatest, ownerAccount, packageId, packageVersion, patchVersion, updatedLatestPatchVersion);
        }
    }
}
