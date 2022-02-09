// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DriveBitLockerKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final DriveBitLockerKeyResponse Empty = new DriveBitLockerKeyResponse();

    @InputImport(name="bitLockerKey")
    private final @Nullable String bitLockerKey;

    public Optional<String> getBitLockerKey() {
        return this.bitLockerKey == null ? Optional.empty() : Optional.ofNullable(this.bitLockerKey);
    }

    @InputImport(name="driveId")
    private final @Nullable String driveId;

    public Optional<String> getDriveId() {
        return this.driveId == null ? Optional.empty() : Optional.ofNullable(this.driveId);
    }

    public DriveBitLockerKeyResponse(
        @Nullable String bitLockerKey,
        @Nullable String driveId) {
        this.bitLockerKey = bitLockerKey;
        this.driveId = driveId;
    }

    private DriveBitLockerKeyResponse() {
        this.bitLockerKey = null;
        this.driveId = null;
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
