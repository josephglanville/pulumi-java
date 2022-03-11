// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.enums.DiscoveryOccurrenceAnalysisStatus;
import io.pulumi.googlenative.containeranalysis_v1.enums.DiscoveryOccurrenceContinuousAnalysis;
import io.pulumi.googlenative.containeranalysis_v1.inputs.StatusArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides information about the analysis status of a discovered resource.
 * 
 */
public final class DiscoveryOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiscoveryOccurrenceArgs Empty = new DiscoveryOccurrenceArgs();

    /**
     * The status of discovery for the resource.
     * 
     */
    @InputImport(name="analysisStatus")
      private final @Nullable Output<DiscoveryOccurrenceAnalysisStatus> analysisStatus;

    public Output<DiscoveryOccurrenceAnalysisStatus> getAnalysisStatus() {
        return this.analysisStatus == null ? Output.empty() : this.analysisStatus;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
     * 
     */
    @InputImport(name="analysisStatusError")
      private final @Nullable Output<StatusArgs> analysisStatusError;

    public Output<StatusArgs> getAnalysisStatusError() {
        return this.analysisStatusError == null ? Output.empty() : this.analysisStatusError;
    }

    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    @InputImport(name="continuousAnalysis")
      private final @Nullable Output<DiscoveryOccurrenceContinuousAnalysis> continuousAnalysis;

    public Output<DiscoveryOccurrenceContinuousAnalysis> getContinuousAnalysis() {
        return this.continuousAnalysis == null ? Output.empty() : this.continuousAnalysis;
    }

    /**
     * The CPE of the resource being scanned.
     * 
     */
    @InputImport(name="cpe")
      private final @Nullable Output<String> cpe;

    public Output<String> getCpe() {
        return this.cpe == null ? Output.empty() : this.cpe;
    }

    /**
     * The last time this resource was scanned.
     * 
     */
    @InputImport(name="lastScanTime")
      private final @Nullable Output<String> lastScanTime;

    public Output<String> getLastScanTime() {
        return this.lastScanTime == null ? Output.empty() : this.lastScanTime;
    }

    public DiscoveryOccurrenceArgs(
        @Nullable Output<DiscoveryOccurrenceAnalysisStatus> analysisStatus,
        @Nullable Output<StatusArgs> analysisStatusError,
        @Nullable Output<DiscoveryOccurrenceContinuousAnalysis> continuousAnalysis,
        @Nullable Output<String> cpe,
        @Nullable Output<String> lastScanTime) {
        this.analysisStatus = analysisStatus;
        this.analysisStatusError = analysisStatusError;
        this.continuousAnalysis = continuousAnalysis;
        this.cpe = cpe;
        this.lastScanTime = lastScanTime;
    }

    private DiscoveryOccurrenceArgs() {
        this.analysisStatus = Output.empty();
        this.analysisStatusError = Output.empty();
        this.continuousAnalysis = Output.empty();
        this.cpe = Output.empty();
        this.lastScanTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DiscoveryOccurrenceAnalysisStatus> analysisStatus;
        private @Nullable Output<StatusArgs> analysisStatusError;
        private @Nullable Output<DiscoveryOccurrenceContinuousAnalysis> continuousAnalysis;
        private @Nullable Output<String> cpe;
        private @Nullable Output<String> lastScanTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
    	      this.cpe = defaults.cpe;
    	      this.lastScanTime = defaults.lastScanTime;
        }

        public Builder analysisStatus(@Nullable Output<DiscoveryOccurrenceAnalysisStatus> analysisStatus) {
            this.analysisStatus = analysisStatus;
            return this;
        }

        public Builder analysisStatus(@Nullable DiscoveryOccurrenceAnalysisStatus analysisStatus) {
            this.analysisStatus = Output.ofNullable(analysisStatus);
            return this;
        }

        public Builder analysisStatusError(@Nullable Output<StatusArgs> analysisStatusError) {
            this.analysisStatusError = analysisStatusError;
            return this;
        }

        public Builder analysisStatusError(@Nullable StatusArgs analysisStatusError) {
            this.analysisStatusError = Output.ofNullable(analysisStatusError);
            return this;
        }

        public Builder continuousAnalysis(@Nullable Output<DiscoveryOccurrenceContinuousAnalysis> continuousAnalysis) {
            this.continuousAnalysis = continuousAnalysis;
            return this;
        }

        public Builder continuousAnalysis(@Nullable DiscoveryOccurrenceContinuousAnalysis continuousAnalysis) {
            this.continuousAnalysis = Output.ofNullable(continuousAnalysis);
            return this;
        }

        public Builder cpe(@Nullable Output<String> cpe) {
            this.cpe = cpe;
            return this;
        }

        public Builder cpe(@Nullable String cpe) {
            this.cpe = Output.ofNullable(cpe);
            return this;
        }

        public Builder lastScanTime(@Nullable Output<String> lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }

        public Builder lastScanTime(@Nullable String lastScanTime) {
            this.lastScanTime = Output.ofNullable(lastScanTime);
            return this;
        }
        public DiscoveryOccurrenceArgs build() {
            return new DiscoveryOccurrenceArgs(analysisStatus, analysisStatusError, continuousAnalysis, cpe, lastScanTime);
        }
    }
}
