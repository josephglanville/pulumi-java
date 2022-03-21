// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.ContactDetailsResponse;
import io.pulumi.azurenative.databox.outputs.CopyProgressResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxDiskCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxHeavyAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataExportDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataImportDetailsResponse;
import io.pulumi.azurenative.databox.outputs.JobStagesResponse;
import io.pulumi.azurenative.databox.outputs.KeyEncryptionKeyResponse;
import io.pulumi.azurenative.databox.outputs.PackageShippingDetailsResponse;
import io.pulumi.azurenative.databox.outputs.PreferencesResponse;
import io.pulumi.azurenative.databox.outputs.ShippingAddressResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataBoxHeavyJobDetailsResponse {
    /**
     * Shared access key to download the chain of custody logs
     * 
     */
    private final String chainOfCustodySasKey;
    /**
     * Contact details for notification and shipping.
     * 
     */
    private final ContactDetailsResponse contactDetails;
    /**
     * List of copy log details.
     * 
     */
    private final List<Object> copyLogDetails;
    /**
     * Copy progress per account.
     * 
     */
    private final List<CopyProgressResponse> copyProgress;
    /**
     * Details of the data to be exported from azure.
     * 
     */
    private final @Nullable List<DataExportDetailsResponse> dataExportDetails;
    /**
     * Details of the data to be imported into azure.
     * 
     */
    private final @Nullable List<DataImportDetailsResponse> dataImportDetails;
    /**
     * Delivery package shipping details.
     * 
     */
    private final PackageShippingDetailsResponse deliveryPackage;
    /**
     * Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    private final @Nullable String devicePassword;
    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    private final @Nullable Integer expectedDataSizeInTeraBytes;
    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxHeavy'.
     * 
     */
    private final String jobDetailsType;
    /**
     * List of stages that run in the job.
     * 
     */
    private final List<JobStagesResponse> jobStages;
    /**
     * Details about which key encryption type is being used.
     * 
     */
    private final @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
    /**
     * Preferences for the order.
     * 
     */
    private final @Nullable PreferencesResponse preferences;
    /**
     * Return package shipping details.
     * 
     */
    private final PackageShippingDetailsResponse returnPackage;
    /**
     * Shared access key to download the return shipment label
     * 
     */
    private final String reverseShipmentLabelSasKey;
    /**
     * Shipping address of the customer.
     * 
     */
    private final @Nullable ShippingAddressResponse shippingAddress;

    @CustomType.Constructor
    private DataBoxHeavyJobDetailsResponse(
        @CustomType.Parameter("chainOfCustodySasKey") String chainOfCustodySasKey,
        @CustomType.Parameter("contactDetails") ContactDetailsResponse contactDetails,
        @CustomType.Parameter("copyLogDetails") List<Object> copyLogDetails,
        @CustomType.Parameter("copyProgress") List<CopyProgressResponse> copyProgress,
        @CustomType.Parameter("dataExportDetails") @Nullable List<DataExportDetailsResponse> dataExportDetails,
        @CustomType.Parameter("dataImportDetails") @Nullable List<DataImportDetailsResponse> dataImportDetails,
        @CustomType.Parameter("deliveryPackage") PackageShippingDetailsResponse deliveryPackage,
        @CustomType.Parameter("devicePassword") @Nullable String devicePassword,
        @CustomType.Parameter("expectedDataSizeInTeraBytes") @Nullable Integer expectedDataSizeInTeraBytes,
        @CustomType.Parameter("jobDetailsType") String jobDetailsType,
        @CustomType.Parameter("jobStages") List<JobStagesResponse> jobStages,
        @CustomType.Parameter("keyEncryptionKey") @Nullable KeyEncryptionKeyResponse keyEncryptionKey,
        @CustomType.Parameter("preferences") @Nullable PreferencesResponse preferences,
        @CustomType.Parameter("returnPackage") PackageShippingDetailsResponse returnPackage,
        @CustomType.Parameter("reverseShipmentLabelSasKey") String reverseShipmentLabelSasKey,
        @CustomType.Parameter("shippingAddress") @Nullable ShippingAddressResponse shippingAddress) {
        this.chainOfCustodySasKey = chainOfCustodySasKey;
        this.contactDetails = contactDetails;
        this.copyLogDetails = copyLogDetails;
        this.copyProgress = copyProgress;
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.deliveryPackage = deliveryPackage;
        this.devicePassword = devicePassword;
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = jobDetailsType;
        this.jobStages = jobStages;
        this.keyEncryptionKey = keyEncryptionKey;
        this.preferences = preferences;
        this.returnPackage = returnPackage;
        this.reverseShipmentLabelSasKey = reverseShipmentLabelSasKey;
        this.shippingAddress = shippingAddress;
    }

    /**
     * Shared access key to download the chain of custody logs
     * 
    */
    public String getChainOfCustodySasKey() {
        return this.chainOfCustodySasKey;
    }
    /**
     * Contact details for notification and shipping.
     * 
    */
    public ContactDetailsResponse getContactDetails() {
        return this.contactDetails;
    }
    /**
     * List of copy log details.
     * 
    */
    public List<Object> getCopyLogDetails() {
        return this.copyLogDetails;
    }
    /**
     * Copy progress per account.
     * 
    */
    public List<CopyProgressResponse> getCopyProgress() {
        return this.copyProgress;
    }
    /**
     * Details of the data to be exported from azure.
     * 
    */
    public List<DataExportDetailsResponse> getDataExportDetails() {
        return this.dataExportDetails == null ? List.of() : this.dataExportDetails;
    }
    /**
     * Details of the data to be imported into azure.
     * 
    */
    public List<DataImportDetailsResponse> getDataImportDetails() {
        return this.dataImportDetails == null ? List.of() : this.dataImportDetails;
    }
    /**
     * Delivery package shipping details.
     * 
    */
    public PackageShippingDetailsResponse getDeliveryPackage() {
        return this.deliveryPackage;
    }
    /**
     * Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
    */
    public Optional<String> getDevicePassword() {
        return Optional.ofNullable(this.devicePassword);
    }
    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
    */
    public Optional<Integer> getExpectedDataSizeInTeraBytes() {
        return Optional.ofNullable(this.expectedDataSizeInTeraBytes);
    }
    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxHeavy'.
     * 
    */
    public String getJobDetailsType() {
        return this.jobDetailsType;
    }
    /**
     * List of stages that run in the job.
     * 
    */
    public List<JobStagesResponse> getJobStages() {
        return this.jobStages;
    }
    /**
     * Details about which key encryption type is being used.
     * 
    */
    public Optional<KeyEncryptionKeyResponse> getKeyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }
    /**
     * Preferences for the order.
     * 
    */
    public Optional<PreferencesResponse> getPreferences() {
        return Optional.ofNullable(this.preferences);
    }
    /**
     * Return package shipping details.
     * 
    */
    public PackageShippingDetailsResponse getReturnPackage() {
        return this.returnPackage;
    }
    /**
     * Shared access key to download the return shipment label
     * 
    */
    public String getReverseShipmentLabelSasKey() {
        return this.reverseShipmentLabelSasKey;
    }
    /**
     * Shipping address of the customer.
     * 
    */
    public Optional<ShippingAddressResponse> getShippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxHeavyJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainOfCustodySasKey;
        private ContactDetailsResponse contactDetails;
        private List<Object> copyLogDetails;
        private List<CopyProgressResponse> copyProgress;
        private @Nullable List<DataExportDetailsResponse> dataExportDetails;
        private @Nullable List<DataImportDetailsResponse> dataImportDetails;
        private PackageShippingDetailsResponse deliveryPackage;
        private @Nullable String devicePassword;
        private @Nullable Integer expectedDataSizeInTeraBytes;
        private String jobDetailsType;
        private List<JobStagesResponse> jobStages;
        private @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
        private @Nullable PreferencesResponse preferences;
        private PackageShippingDetailsResponse returnPackage;
        private String reverseShipmentLabelSasKey;
        private @Nullable ShippingAddressResponse shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxHeavyJobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainOfCustodySasKey = defaults.chainOfCustodySasKey;
    	      this.contactDetails = defaults.contactDetails;
    	      this.copyLogDetails = defaults.copyLogDetails;
    	      this.copyProgress = defaults.copyProgress;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.devicePassword = defaults.devicePassword;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.jobStages = defaults.jobStages;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.preferences = defaults.preferences;
    	      this.returnPackage = defaults.returnPackage;
    	      this.reverseShipmentLabelSasKey = defaults.reverseShipmentLabelSasKey;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder chainOfCustodySasKey(String chainOfCustodySasKey) {
            this.chainOfCustodySasKey = Objects.requireNonNull(chainOfCustodySasKey);
            return this;
        }
        public Builder contactDetails(ContactDetailsResponse contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }
        public Builder copyLogDetails(List<Object> copyLogDetails) {
            this.copyLogDetails = Objects.requireNonNull(copyLogDetails);
            return this;
        }
        public Builder copyLogDetails(Object... copyLogDetails) {
            return copyLogDetails(List.of(copyLogDetails));
        }
        public Builder copyProgress(List<CopyProgressResponse> copyProgress) {
            this.copyProgress = Objects.requireNonNull(copyProgress);
            return this;
        }
        public Builder copyProgress(CopyProgressResponse... copyProgress) {
            return copyProgress(List.of(copyProgress));
        }
        public Builder dataExportDetails(@Nullable List<DataExportDetailsResponse> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }
        public Builder dataExportDetails(DataExportDetailsResponse... dataExportDetails) {
            return dataExportDetails(List.of(dataExportDetails));
        }
        public Builder dataImportDetails(@Nullable List<DataImportDetailsResponse> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }
        public Builder dataImportDetails(DataImportDetailsResponse... dataImportDetails) {
            return dataImportDetails(List.of(dataImportDetails));
        }
        public Builder deliveryPackage(PackageShippingDetailsResponse deliveryPackage) {
            this.deliveryPackage = Objects.requireNonNull(deliveryPackage);
            return this;
        }
        public Builder devicePassword(@Nullable String devicePassword) {
            this.devicePassword = devicePassword;
            return this;
        }
        public Builder expectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }
        public Builder jobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }
        public Builder jobStages(List<JobStagesResponse> jobStages) {
            this.jobStages = Objects.requireNonNull(jobStages);
            return this;
        }
        public Builder jobStages(JobStagesResponse... jobStages) {
            return jobStages(List.of(jobStages));
        }
        public Builder keyEncryptionKey(@Nullable KeyEncryptionKeyResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public Builder preferences(@Nullable PreferencesResponse preferences) {
            this.preferences = preferences;
            return this;
        }
        public Builder returnPackage(PackageShippingDetailsResponse returnPackage) {
            this.returnPackage = Objects.requireNonNull(returnPackage);
            return this;
        }
        public Builder reverseShipmentLabelSasKey(String reverseShipmentLabelSasKey) {
            this.reverseShipmentLabelSasKey = Objects.requireNonNull(reverseShipmentLabelSasKey);
            return this;
        }
        public Builder shippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }        public DataBoxHeavyJobDetailsResponse build() {
            return new DataBoxHeavyJobDetailsResponse(chainOfCustodySasKey, contactDetails, copyLogDetails, copyProgress, dataExportDetails, dataImportDetails, deliveryPackage, devicePassword, expectedDataSizeInTeraBytes, jobDetailsType, jobStages, keyEncryptionKey, preferences, returnPackage, reverseShipmentLabelSasKey, shippingAddress);
        }
    }
}
