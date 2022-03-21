// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.enums.AssessmentSizingCriterion;
import io.pulumi.azurenative.migrate.enums.AssessmentStage;
import io.pulumi.azurenative.migrate.enums.AzureDiskType;
import io.pulumi.azurenative.migrate.enums.AzureHybridUseBenefit;
import io.pulumi.azurenative.migrate.enums.AzureLocation;
import io.pulumi.azurenative.migrate.enums.AzureOfferCode;
import io.pulumi.azurenative.migrate.enums.AzurePricingTier;
import io.pulumi.azurenative.migrate.enums.AzureStorageRedundancy;
import io.pulumi.azurenative.migrate.enums.AzureVmFamily;
import io.pulumi.azurenative.migrate.enums.Currency;
import io.pulumi.azurenative.migrate.enums.Percentile;
import io.pulumi.azurenative.migrate.enums.ReservedInstance;
import io.pulumi.azurenative.migrate.enums.TimeRange;
import io.pulumi.azurenative.migrate.inputs.VmUptimeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Properties of an assessment.
 * 
 */
public final class AssessmentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentPropertiesArgs Empty = new AssessmentPropertiesArgs();

    /**
     * Storage type selected for this disk.
     * 
     */
    @Import(name="azureDiskType", required=true)
      private final Output<Either<String,AzureDiskType>> azureDiskType;

    public Output<Either<String,AzureDiskType>> getAzureDiskType() {
        return this.azureDiskType;
    }

    /**
     * AHUB discount on windows virtual machines.
     * 
     */
    @Import(name="azureHybridUseBenefit", required=true)
      private final Output<Either<String,AzureHybridUseBenefit>> azureHybridUseBenefit;

    public Output<Either<String,AzureHybridUseBenefit>> getAzureHybridUseBenefit() {
        return this.azureHybridUseBenefit;
    }

    /**
     * Target Azure location for which the machines should be assessed. These enums are the same as used by Compute API.
     * 
     */
    @Import(name="azureLocation", required=true)
      private final Output<Either<String,AzureLocation>> azureLocation;

    public Output<Either<String,AzureLocation>> getAzureLocation() {
        return this.azureLocation;
    }

    /**
     * Offer code according to which cost estimation is done.
     * 
     */
    @Import(name="azureOfferCode", required=true)
      private final Output<Either<String,AzureOfferCode>> azureOfferCode;

    public Output<Either<String,AzureOfferCode>> getAzureOfferCode() {
        return this.azureOfferCode;
    }

    /**
     * Pricing tier for Size evaluation.
     * 
     */
    @Import(name="azurePricingTier", required=true)
      private final Output<Either<String,AzurePricingTier>> azurePricingTier;

    public Output<Either<String,AzurePricingTier>> getAzurePricingTier() {
        return this.azurePricingTier;
    }

    /**
     * Storage Redundancy type offered by Azure.
     * 
     */
    @Import(name="azureStorageRedundancy", required=true)
      private final Output<Either<String,AzureStorageRedundancy>> azureStorageRedundancy;

    public Output<Either<String,AzureStorageRedundancy>> getAzureStorageRedundancy() {
        return this.azureStorageRedundancy;
    }

    /**
     * List of azure VM families.
     * 
     */
    @Import(name="azureVmFamilies", required=true)
      private final Output<List<Either<String,AzureVmFamily>>> azureVmFamilies;

    public Output<List<Either<String,AzureVmFamily>>> getAzureVmFamilies() {
        return this.azureVmFamilies;
    }

    /**
     * Currency to report prices in.
     * 
     */
    @Import(name="currency", required=true)
      private final Output<Either<String,Currency>> currency;

    public Output<Either<String,Currency>> getCurrency() {
        return this.currency;
    }

    /**
     * Custom discount percentage to be applied on final costs. Can be in the range [0, 100].
     * 
     */
    @Import(name="discountPercentage", required=true)
      private final Output<Double> discountPercentage;

    public Output<Double> getDiscountPercentage() {
        return this.discountPercentage;
    }

    /**
     * Percentile of performance data used to recommend Azure size.
     * 
     */
    @Import(name="percentile", required=true)
      private final Output<Either<String,Percentile>> percentile;

    public Output<Either<String,Percentile>> getPercentile() {
        return this.percentile;
    }

    /**
     * Azure reserved instance.
     * 
     */
    @Import(name="reservedInstance", required=true)
      private final Output<Either<String,ReservedInstance>> reservedInstance;

    public Output<Either<String,ReservedInstance>> getReservedInstance() {
        return this.reservedInstance;
    }

    /**
     * Scaling factor used over utilization data to add a performance buffer for new machines to be created in Azure. Min Value = 1.0, Max value = 1.9, Default = 1.3.
     * 
     */
    @Import(name="scalingFactor", required=true)
      private final Output<Double> scalingFactor;

    public Output<Double> getScalingFactor() {
        return this.scalingFactor;
    }

    /**
     * Assessment sizing criterion.
     * 
     */
    @Import(name="sizingCriterion", required=true)
      private final Output<Either<String,AssessmentSizingCriterion>> sizingCriterion;

    public Output<Either<String,AssessmentSizingCriterion>> getSizingCriterion() {
        return this.sizingCriterion;
    }

    /**
     * User configurable setting that describes the status of the assessment.
     * 
     */
    @Import(name="stage", required=true)
      private final Output<Either<String,AssessmentStage>> stage;

    public Output<Either<String,AssessmentStage>> getStage() {
        return this.stage;
    }

    /**
     * Time range of performance data used to recommend a size.
     * 
     */
    @Import(name="timeRange", required=true)
      private final Output<Either<String,TimeRange>> timeRange;

    public Output<Either<String,TimeRange>> getTimeRange() {
        return this.timeRange;
    }

    /**
     * Specify the duration for which the VMs are up in the on-premises environment.
     * 
     */
    @Import(name="vmUptime", required=true)
      private final Output<VmUptimeArgs> vmUptime;

    public Output<VmUptimeArgs> getVmUptime() {
        return this.vmUptime;
    }

    public AssessmentPropertiesArgs(
        Output<Either<String,AzureDiskType>> azureDiskType,
        Output<Either<String,AzureHybridUseBenefit>> azureHybridUseBenefit,
        Output<Either<String,AzureLocation>> azureLocation,
        Output<Either<String,AzureOfferCode>> azureOfferCode,
        Output<Either<String,AzurePricingTier>> azurePricingTier,
        Output<Either<String,AzureStorageRedundancy>> azureStorageRedundancy,
        Output<List<Either<String,AzureVmFamily>>> azureVmFamilies,
        Output<Either<String,Currency>> currency,
        Output<Double> discountPercentage,
        Output<Either<String,Percentile>> percentile,
        Output<Either<String,ReservedInstance>> reservedInstance,
        Output<Double> scalingFactor,
        Output<Either<String,AssessmentSizingCriterion>> sizingCriterion,
        Output<Either<String,AssessmentStage>> stage,
        Output<Either<String,TimeRange>> timeRange,
        Output<VmUptimeArgs> vmUptime) {
        this.azureDiskType = Objects.requireNonNull(azureDiskType, "expected parameter 'azureDiskType' to be non-null");
        this.azureHybridUseBenefit = Objects.requireNonNull(azureHybridUseBenefit, "expected parameter 'azureHybridUseBenefit' to be non-null");
        this.azureLocation = Objects.requireNonNull(azureLocation, "expected parameter 'azureLocation' to be non-null");
        this.azureOfferCode = Objects.requireNonNull(azureOfferCode, "expected parameter 'azureOfferCode' to be non-null");
        this.azurePricingTier = Objects.requireNonNull(azurePricingTier, "expected parameter 'azurePricingTier' to be non-null");
        this.azureStorageRedundancy = Objects.requireNonNull(azureStorageRedundancy, "expected parameter 'azureStorageRedundancy' to be non-null");
        this.azureVmFamilies = Objects.requireNonNull(azureVmFamilies, "expected parameter 'azureVmFamilies' to be non-null");
        this.currency = Objects.requireNonNull(currency, "expected parameter 'currency' to be non-null");
        this.discountPercentage = Objects.requireNonNull(discountPercentage, "expected parameter 'discountPercentage' to be non-null");
        this.percentile = Objects.requireNonNull(percentile, "expected parameter 'percentile' to be non-null");
        this.reservedInstance = Objects.requireNonNull(reservedInstance, "expected parameter 'reservedInstance' to be non-null");
        this.scalingFactor = Objects.requireNonNull(scalingFactor, "expected parameter 'scalingFactor' to be non-null");
        this.sizingCriterion = Objects.requireNonNull(sizingCriterion, "expected parameter 'sizingCriterion' to be non-null");
        this.stage = Objects.requireNonNull(stage, "expected parameter 'stage' to be non-null");
        this.timeRange = Objects.requireNonNull(timeRange, "expected parameter 'timeRange' to be non-null");
        this.vmUptime = Objects.requireNonNull(vmUptime, "expected parameter 'vmUptime' to be non-null");
    }

    private AssessmentPropertiesArgs() {
        this.azureDiskType = Output.empty();
        this.azureHybridUseBenefit = Output.empty();
        this.azureLocation = Output.empty();
        this.azureOfferCode = Output.empty();
        this.azurePricingTier = Output.empty();
        this.azureStorageRedundancy = Output.empty();
        this.azureVmFamilies = Output.empty();
        this.currency = Output.empty();
        this.discountPercentage = Output.empty();
        this.percentile = Output.empty();
        this.reservedInstance = Output.empty();
        this.scalingFactor = Output.empty();
        this.sizingCriterion = Output.empty();
        this.stage = Output.empty();
        this.timeRange = Output.empty();
        this.vmUptime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AzureDiskType>> azureDiskType;
        private Output<Either<String,AzureHybridUseBenefit>> azureHybridUseBenefit;
        private Output<Either<String,AzureLocation>> azureLocation;
        private Output<Either<String,AzureOfferCode>> azureOfferCode;
        private Output<Either<String,AzurePricingTier>> azurePricingTier;
        private Output<Either<String,AzureStorageRedundancy>> azureStorageRedundancy;
        private Output<List<Either<String,AzureVmFamily>>> azureVmFamilies;
        private Output<Either<String,Currency>> currency;
        private Output<Double> discountPercentage;
        private Output<Either<String,Percentile>> percentile;
        private Output<Either<String,ReservedInstance>> reservedInstance;
        private Output<Double> scalingFactor;
        private Output<Either<String,AssessmentSizingCriterion>> sizingCriterion;
        private Output<Either<String,AssessmentStage>> stage;
        private Output<Either<String,TimeRange>> timeRange;
        private Output<VmUptimeArgs> vmUptime;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDiskType = defaults.azureDiskType;
    	      this.azureHybridUseBenefit = defaults.azureHybridUseBenefit;
    	      this.azureLocation = defaults.azureLocation;
    	      this.azureOfferCode = defaults.azureOfferCode;
    	      this.azurePricingTier = defaults.azurePricingTier;
    	      this.azureStorageRedundancy = defaults.azureStorageRedundancy;
    	      this.azureVmFamilies = defaults.azureVmFamilies;
    	      this.currency = defaults.currency;
    	      this.discountPercentage = defaults.discountPercentage;
    	      this.percentile = defaults.percentile;
    	      this.reservedInstance = defaults.reservedInstance;
    	      this.scalingFactor = defaults.scalingFactor;
    	      this.sizingCriterion = defaults.sizingCriterion;
    	      this.stage = defaults.stage;
    	      this.timeRange = defaults.timeRange;
    	      this.vmUptime = defaults.vmUptime;
        }

        public Builder azureDiskType(Output<Either<String,AzureDiskType>> azureDiskType) {
            this.azureDiskType = Objects.requireNonNull(azureDiskType);
            return this;
        }
        public Builder azureDiskType(Either<String,AzureDiskType> azureDiskType) {
            this.azureDiskType = Output.of(Objects.requireNonNull(azureDiskType));
            return this;
        }
        public Builder azureHybridUseBenefit(Output<Either<String,AzureHybridUseBenefit>> azureHybridUseBenefit) {
            this.azureHybridUseBenefit = Objects.requireNonNull(azureHybridUseBenefit);
            return this;
        }
        public Builder azureHybridUseBenefit(Either<String,AzureHybridUseBenefit> azureHybridUseBenefit) {
            this.azureHybridUseBenefit = Output.of(Objects.requireNonNull(azureHybridUseBenefit));
            return this;
        }
        public Builder azureLocation(Output<Either<String,AzureLocation>> azureLocation) {
            this.azureLocation = Objects.requireNonNull(azureLocation);
            return this;
        }
        public Builder azureLocation(Either<String,AzureLocation> azureLocation) {
            this.azureLocation = Output.of(Objects.requireNonNull(azureLocation));
            return this;
        }
        public Builder azureOfferCode(Output<Either<String,AzureOfferCode>> azureOfferCode) {
            this.azureOfferCode = Objects.requireNonNull(azureOfferCode);
            return this;
        }
        public Builder azureOfferCode(Either<String,AzureOfferCode> azureOfferCode) {
            this.azureOfferCode = Output.of(Objects.requireNonNull(azureOfferCode));
            return this;
        }
        public Builder azurePricingTier(Output<Either<String,AzurePricingTier>> azurePricingTier) {
            this.azurePricingTier = Objects.requireNonNull(azurePricingTier);
            return this;
        }
        public Builder azurePricingTier(Either<String,AzurePricingTier> azurePricingTier) {
            this.azurePricingTier = Output.of(Objects.requireNonNull(azurePricingTier));
            return this;
        }
        public Builder azureStorageRedundancy(Output<Either<String,AzureStorageRedundancy>> azureStorageRedundancy) {
            this.azureStorageRedundancy = Objects.requireNonNull(azureStorageRedundancy);
            return this;
        }
        public Builder azureStorageRedundancy(Either<String,AzureStorageRedundancy> azureStorageRedundancy) {
            this.azureStorageRedundancy = Output.of(Objects.requireNonNull(azureStorageRedundancy));
            return this;
        }
        public Builder azureVmFamilies(Output<List<Either<String,AzureVmFamily>>> azureVmFamilies) {
            this.azureVmFamilies = Objects.requireNonNull(azureVmFamilies);
            return this;
        }
        public Builder azureVmFamilies(List<Either<String,AzureVmFamily>> azureVmFamilies) {
            this.azureVmFamilies = Output.of(Objects.requireNonNull(azureVmFamilies));
            return this;
        }
        public Builder azureVmFamilies(Either<String,AzureVmFamily>... azureVmFamilies) {
            return azureVmFamilies(List.of(azureVmFamilies));
        }
        public Builder currency(Output<Either<String,Currency>> currency) {
            this.currency = Objects.requireNonNull(currency);
            return this;
        }
        public Builder currency(Either<String,Currency> currency) {
            this.currency = Output.of(Objects.requireNonNull(currency));
            return this;
        }
        public Builder discountPercentage(Output<Double> discountPercentage) {
            this.discountPercentage = Objects.requireNonNull(discountPercentage);
            return this;
        }
        public Builder discountPercentage(Double discountPercentage) {
            this.discountPercentage = Output.of(Objects.requireNonNull(discountPercentage));
            return this;
        }
        public Builder percentile(Output<Either<String,Percentile>> percentile) {
            this.percentile = Objects.requireNonNull(percentile);
            return this;
        }
        public Builder percentile(Either<String,Percentile> percentile) {
            this.percentile = Output.of(Objects.requireNonNull(percentile));
            return this;
        }
        public Builder reservedInstance(Output<Either<String,ReservedInstance>> reservedInstance) {
            this.reservedInstance = Objects.requireNonNull(reservedInstance);
            return this;
        }
        public Builder reservedInstance(Either<String,ReservedInstance> reservedInstance) {
            this.reservedInstance = Output.of(Objects.requireNonNull(reservedInstance));
            return this;
        }
        public Builder scalingFactor(Output<Double> scalingFactor) {
            this.scalingFactor = Objects.requireNonNull(scalingFactor);
            return this;
        }
        public Builder scalingFactor(Double scalingFactor) {
            this.scalingFactor = Output.of(Objects.requireNonNull(scalingFactor));
            return this;
        }
        public Builder sizingCriterion(Output<Either<String,AssessmentSizingCriterion>> sizingCriterion) {
            this.sizingCriterion = Objects.requireNonNull(sizingCriterion);
            return this;
        }
        public Builder sizingCriterion(Either<String,AssessmentSizingCriterion> sizingCriterion) {
            this.sizingCriterion = Output.of(Objects.requireNonNull(sizingCriterion));
            return this;
        }
        public Builder stage(Output<Either<String,AssessmentStage>> stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public Builder stage(Either<String,AssessmentStage> stage) {
            this.stage = Output.of(Objects.requireNonNull(stage));
            return this;
        }
        public Builder timeRange(Output<Either<String,TimeRange>> timeRange) {
            this.timeRange = Objects.requireNonNull(timeRange);
            return this;
        }
        public Builder timeRange(Either<String,TimeRange> timeRange) {
            this.timeRange = Output.of(Objects.requireNonNull(timeRange));
            return this;
        }
        public Builder vmUptime(Output<VmUptimeArgs> vmUptime) {
            this.vmUptime = Objects.requireNonNull(vmUptime);
            return this;
        }
        public Builder vmUptime(VmUptimeArgs vmUptime) {
            this.vmUptime = Output.of(Objects.requireNonNull(vmUptime));
            return this;
        }        public AssessmentPropertiesArgs build() {
            return new AssessmentPropertiesArgs(azureDiskType, azureHybridUseBenefit, azureLocation, azureOfferCode, azurePricingTier, azureStorageRedundancy, azureVmFamilies, currency, discountPercentage, percentile, reservedInstance, scalingFactor, sizingCriterion, stage, timeRange, vmUptime);
        }
    }
}
