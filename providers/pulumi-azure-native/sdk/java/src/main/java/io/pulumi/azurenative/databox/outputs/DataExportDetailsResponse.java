// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.ManagedDiskDetailsResponse;
import io.pulumi.azurenative.databox.outputs.StorageAccountDetailsResponse;
import io.pulumi.azurenative.databox.outputs.TransferConfigurationResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataExportDetailsResponse {
    private final Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails;
    private final @Nullable String logCollectionLevel;
    private final TransferConfigurationResponse transferConfiguration;

    @OutputCustomType.Constructor({"accountDetails","logCollectionLevel","transferConfiguration"})
    private DataExportDetailsResponse(
        Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails,
        @Nullable String logCollectionLevel,
        TransferConfigurationResponse transferConfiguration) {
        this.accountDetails = Objects.requireNonNull(accountDetails);
        this.logCollectionLevel = logCollectionLevel;
        this.transferConfiguration = Objects.requireNonNull(transferConfiguration);
    }

    public Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> getAccountDetails() {
        return this.accountDetails;
    }
    public Optional<String> getLogCollectionLevel() {
        return Optional.ofNullable(this.logCollectionLevel);
    }
    public TransferConfigurationResponse getTransferConfiguration() {
        return this.transferConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataExportDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails;
        private @Nullable String logCollectionLevel;
        private TransferConfigurationResponse transferConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataExportDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountDetails = defaults.accountDetails;
    	      this.logCollectionLevel = defaults.logCollectionLevel;
    	      this.transferConfiguration = defaults.transferConfiguration;
        }

        public Builder setAccountDetails(Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails) {
            this.accountDetails = Objects.requireNonNull(accountDetails);
            return this;
        }

        public Builder setLogCollectionLevel(@Nullable String logCollectionLevel) {
            this.logCollectionLevel = logCollectionLevel;
            return this;
        }

        public Builder setTransferConfiguration(TransferConfigurationResponse transferConfiguration) {
            this.transferConfiguration = Objects.requireNonNull(transferConfiguration);
            return this;
        }

        public DataExportDetailsResponse build() {
            return new DataExportDetailsResponse(accountDetails, logCollectionLevel, transferConfiguration);
        }
    }
}
