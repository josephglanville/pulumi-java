// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingCloudWatchToKinesisArgs;
import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingKinesisToS3Args;
import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingKubernetesScubaReaderArgs;
import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingKubernetesServiceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Defender for Containers AWS offering configurations
 * 
 */
public final class DefenderForContainersAwsOfferingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefenderForContainersAwsOfferingArgs Empty = new DefenderForContainersAwsOfferingArgs();

    /**
     * The cloudwatch to kinesis connection configuration
     * 
     */
    @Import(name="cloudWatchToKinesis")
      private final @Nullable Output<DefenderForContainersAwsOfferingCloudWatchToKinesisArgs> cloudWatchToKinesis;

    public Output<DefenderForContainersAwsOfferingCloudWatchToKinesisArgs> getCloudWatchToKinesis() {
        return this.cloudWatchToKinesis == null ? Output.empty() : this.cloudWatchToKinesis;
    }

    /**
     * The kinesis to s3 connection configuration
     * 
     */
    @Import(name="kinesisToS3")
      private final @Nullable Output<DefenderForContainersAwsOfferingKinesisToS3Args> kinesisToS3;

    public Output<DefenderForContainersAwsOfferingKinesisToS3Args> getKinesisToS3() {
        return this.kinesisToS3 == null ? Output.empty() : this.kinesisToS3;
    }

    /**
     * The kubernetes to scuba connection configuration
     * 
     */
    @Import(name="kubernetesScubaReader")
      private final @Nullable Output<DefenderForContainersAwsOfferingKubernetesScubaReaderArgs> kubernetesScubaReader;

    public Output<DefenderForContainersAwsOfferingKubernetesScubaReaderArgs> getKubernetesScubaReader() {
        return this.kubernetesScubaReader == null ? Output.empty() : this.kubernetesScubaReader;
    }

    /**
     * The kubernetes service connection configuration
     * 
     */
    @Import(name="kubernetesService")
      private final @Nullable Output<DefenderForContainersAwsOfferingKubernetesServiceArgs> kubernetesService;

    public Output<DefenderForContainersAwsOfferingKubernetesServiceArgs> getKubernetesService() {
        return this.kubernetesService == null ? Output.empty() : this.kubernetesService;
    }

    /**
     * The type of the security offering.
     * Expected value is 'DefenderForContainersAws'.
     * 
     */
    @Import(name="offeringType", required=true)
      private final Output<String> offeringType;

    public Output<String> getOfferingType() {
        return this.offeringType;
    }

    public DefenderForContainersAwsOfferingArgs(
        @Nullable Output<DefenderForContainersAwsOfferingCloudWatchToKinesisArgs> cloudWatchToKinesis,
        @Nullable Output<DefenderForContainersAwsOfferingKinesisToS3Args> kinesisToS3,
        @Nullable Output<DefenderForContainersAwsOfferingKubernetesScubaReaderArgs> kubernetesScubaReader,
        @Nullable Output<DefenderForContainersAwsOfferingKubernetesServiceArgs> kubernetesService,
        Output<String> offeringType) {
        this.cloudWatchToKinesis = cloudWatchToKinesis;
        this.kinesisToS3 = kinesisToS3;
        this.kubernetesScubaReader = kubernetesScubaReader;
        this.kubernetesService = kubernetesService;
        this.offeringType = Objects.requireNonNull(offeringType, "expected parameter 'offeringType' to be non-null");
    }

    private DefenderForContainersAwsOfferingArgs() {
        this.cloudWatchToKinesis = Output.empty();
        this.kinesisToS3 = Output.empty();
        this.kubernetesScubaReader = Output.empty();
        this.kubernetesService = Output.empty();
        this.offeringType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DefenderForContainersAwsOfferingCloudWatchToKinesisArgs> cloudWatchToKinesis;
        private @Nullable Output<DefenderForContainersAwsOfferingKinesisToS3Args> kinesisToS3;
        private @Nullable Output<DefenderForContainersAwsOfferingKubernetesScubaReaderArgs> kubernetesScubaReader;
        private @Nullable Output<DefenderForContainersAwsOfferingKubernetesServiceArgs> kubernetesService;
        private Output<String> offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchToKinesis = defaults.cloudWatchToKinesis;
    	      this.kinesisToS3 = defaults.kinesisToS3;
    	      this.kubernetesScubaReader = defaults.kubernetesScubaReader;
    	      this.kubernetesService = defaults.kubernetesService;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder cloudWatchToKinesis(@Nullable Output<DefenderForContainersAwsOfferingCloudWatchToKinesisArgs> cloudWatchToKinesis) {
            this.cloudWatchToKinesis = cloudWatchToKinesis;
            return this;
        }
        public Builder cloudWatchToKinesis(@Nullable DefenderForContainersAwsOfferingCloudWatchToKinesisArgs cloudWatchToKinesis) {
            this.cloudWatchToKinesis = Output.ofNullable(cloudWatchToKinesis);
            return this;
        }
        public Builder kinesisToS3(@Nullable Output<DefenderForContainersAwsOfferingKinesisToS3Args> kinesisToS3) {
            this.kinesisToS3 = kinesisToS3;
            return this;
        }
        public Builder kinesisToS3(@Nullable DefenderForContainersAwsOfferingKinesisToS3Args kinesisToS3) {
            this.kinesisToS3 = Output.ofNullable(kinesisToS3);
            return this;
        }
        public Builder kubernetesScubaReader(@Nullable Output<DefenderForContainersAwsOfferingKubernetesScubaReaderArgs> kubernetesScubaReader) {
            this.kubernetesScubaReader = kubernetesScubaReader;
            return this;
        }
        public Builder kubernetesScubaReader(@Nullable DefenderForContainersAwsOfferingKubernetesScubaReaderArgs kubernetesScubaReader) {
            this.kubernetesScubaReader = Output.ofNullable(kubernetesScubaReader);
            return this;
        }
        public Builder kubernetesService(@Nullable Output<DefenderForContainersAwsOfferingKubernetesServiceArgs> kubernetesService) {
            this.kubernetesService = kubernetesService;
            return this;
        }
        public Builder kubernetesService(@Nullable DefenderForContainersAwsOfferingKubernetesServiceArgs kubernetesService) {
            this.kubernetesService = Output.ofNullable(kubernetesService);
            return this;
        }
        public Builder offeringType(Output<String> offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }
        public Builder offeringType(String offeringType) {
            this.offeringType = Output.of(Objects.requireNonNull(offeringType));
            return this;
        }        public DefenderForContainersAwsOfferingArgs build() {
            return new DefenderForContainersAwsOfferingArgs(cloudWatchToKinesis, kinesisToS3, kubernetesScubaReader, kubernetesService, offeringType);
        }
    }
}
