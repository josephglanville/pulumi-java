// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Wait policy to use when creating/updating dataset. Default is to wait for SPICE ingestion to finish with timeout of 36 hours.</p>
 * 
 */
public final class DataSetIngestionWaitPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetIngestionWaitPolicyArgs Empty = new DataSetIngestionWaitPolicyArgs();

    /**
     * <p>The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.</p>
     * 
     */
    @Import(name="ingestionWaitTimeInHours")
      private final @Nullable Output<Double> ingestionWaitTimeInHours;

    public Output<Double> getIngestionWaitTimeInHours() {
        return this.ingestionWaitTimeInHours == null ? Codegen.empty() : this.ingestionWaitTimeInHours;
    }

    /**
     * <p>Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.</p>
     * 
     */
    @Import(name="waitForSpiceIngestion")
      private final @Nullable Output<Boolean> waitForSpiceIngestion;

    public Output<Boolean> getWaitForSpiceIngestion() {
        return this.waitForSpiceIngestion == null ? Codegen.empty() : this.waitForSpiceIngestion;
    }

    public DataSetIngestionWaitPolicyArgs(
        @Nullable Output<Double> ingestionWaitTimeInHours,
        @Nullable Output<Boolean> waitForSpiceIngestion) {
        this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
        this.waitForSpiceIngestion = waitForSpiceIngestion;
    }

    private DataSetIngestionWaitPolicyArgs() {
        this.ingestionWaitTimeInHours = Codegen.empty();
        this.waitForSpiceIngestion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetIngestionWaitPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> ingestionWaitTimeInHours;
        private @Nullable Output<Boolean> waitForSpiceIngestion;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetIngestionWaitPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestionWaitTimeInHours = defaults.ingestionWaitTimeInHours;
    	      this.waitForSpiceIngestion = defaults.waitForSpiceIngestion;
        }

        public Builder ingestionWaitTimeInHours(@Nullable Output<Double> ingestionWaitTimeInHours) {
            this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
            return this;
        }
        public Builder ingestionWaitTimeInHours(@Nullable Double ingestionWaitTimeInHours) {
            this.ingestionWaitTimeInHours = Codegen.ofNullable(ingestionWaitTimeInHours);
            return this;
        }
        public Builder waitForSpiceIngestion(@Nullable Output<Boolean> waitForSpiceIngestion) {
            this.waitForSpiceIngestion = waitForSpiceIngestion;
            return this;
        }
        public Builder waitForSpiceIngestion(@Nullable Boolean waitForSpiceIngestion) {
            this.waitForSpiceIngestion = Codegen.ofNullable(waitForSpiceIngestion);
            return this;
        }        public DataSetIngestionWaitPolicyArgs build() {
            return new DataSetIngestionWaitPolicyArgs(ingestionWaitTimeInHours, waitForSpiceIngestion);
        }
    }
}
