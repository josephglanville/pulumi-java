// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DriveBitLockerKeyResponse {
    private final @Nullable String bitLockerKey;
    private final @Nullable String driveId;

    @OutputCustomType.Constructor({"bitLockerKey","driveId"})
    private DriveBitLockerKeyResponse(
        @Nullable String bitLockerKey,
        @Nullable String driveId) {
        this.bitLockerKey = bitLockerKey;
        this.driveId = driveId;
    }

    public Optional<String> getBitLockerKey() {
        return Optional.ofNullable(this.bitLockerKey);
    }
    public Optional<String> getDriveId() {
        return Optional.ofNullable(this.driveId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DriveBitLockerKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bitLockerKey;
        private @Nullable String driveId;

        public Builder() {
    	      // Empty
        }

        public Builder(DriveBitLockerKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitLockerKey = defaults.bitLockerKey;
    	      this.driveId = defaults.driveId;
        }

        public Builder setBitLockerKey(@Nullable String bitLockerKey) {
            this.bitLockerKey = bitLockerKey;
            return this;
        }

        public Builder setDriveId(@Nullable String driveId) {
            this.driveId = driveId;
            return this;
        }

        public DriveBitLockerKeyResponse build() {
            return new DriveBitLockerKeyResponse(bitLockerKey, driveId);
        }
    }
}
