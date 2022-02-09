// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MabFileFolderProtectedItemExtendedInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final MabFileFolderProtectedItemExtendedInfoResponse Empty = new MabFileFolderProtectedItemExtendedInfoResponse();

    @InputImport(name="lastRefreshedAt")
    private final @Nullable String lastRefreshedAt;

    public Optional<String> getLastRefreshedAt() {
        return this.lastRefreshedAt == null ? Optional.empty() : Optional.ofNullable(this.lastRefreshedAt);
    }

    @InputImport(name="oldestRecoveryPoint")
    private final @Nullable String oldestRecoveryPoint;

    public Optional<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.oldestRecoveryPoint);
    }

    @InputImport(name="recoveryPointCount")
    private final @Nullable Integer recoveryPointCount;

    public Optional<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointCount);
    }

    public MabFileFolderProtectedItemExtendedInfoResponse(
        @Nullable String lastRefreshedAt,
        @Nullable String oldestRecoveryPoint,
        @Nullable Integer recoveryPointCount) {
        this.lastRefreshedAt = lastRefreshedAt;
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.recoveryPointCount = recoveryPointCount;
    }

    private MabFileFolderProtectedItemExtendedInfoResponse() {
        this.lastRefreshedAt = null;
        this.oldestRecoveryPoint = null;
        this.recoveryPointCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabFileFolderProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastRefreshedAt;
        private @Nullable String oldestRecoveryPoint;
        private @Nullable Integer recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(MabFileFolderProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder setLastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        public Builder setOldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public MabFileFolderProtectedItemExtendedInfoResponse build() {
            return new MabFileFolderProtectedItemExtendedInfoResponse(lastRefreshedAt, oldestRecoveryPoint, recoveryPointCount);
        }
    }
}
