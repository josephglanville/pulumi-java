// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.enums.DoubleEncryptionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionPreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionPreferencesArgs Empty = new EncryptionPreferencesArgs();

    @InputImport(name="doubleEncryptionStatus")
    private final @Nullable Input<Either<String,DoubleEncryptionStatus>> doubleEncryptionStatus;

    public Input<Either<String,DoubleEncryptionStatus>> getDoubleEncryptionStatus() {
        return this.doubleEncryptionStatus == null ? Input.empty() : this.doubleEncryptionStatus;
    }

    public EncryptionPreferencesArgs(@Nullable Input<Either<String,DoubleEncryptionStatus>> doubleEncryptionStatus) {
        this.doubleEncryptionStatus = doubleEncryptionStatus;
    }

    private EncryptionPreferencesArgs() {
        this.doubleEncryptionStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DoubleEncryptionStatus>> doubleEncryptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doubleEncryptionStatus = defaults.doubleEncryptionStatus;
        }

        public Builder setDoubleEncryptionStatus(@Nullable Input<Either<String,DoubleEncryptionStatus>> doubleEncryptionStatus) {
            this.doubleEncryptionStatus = doubleEncryptionStatus;
            return this;
        }

        public Builder setDoubleEncryptionStatus(@Nullable Either<String,DoubleEncryptionStatus> doubleEncryptionStatus) {
            this.doubleEncryptionStatus = Input.ofNullable(doubleEncryptionStatus);
            return this;
        }

        public EncryptionPreferencesArgs build() {
            return new EncryptionPreferencesArgs(doubleEncryptionStatus);
        }
    }
}
