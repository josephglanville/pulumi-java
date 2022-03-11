// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTrafficArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTrafficArgs Empty = new ServiceTrafficArgs();

    /**
     * LatestRevision may be optionally provided to indicate that the latest ready
     * Revision of the Configuration should be used for this traffic target. When
     * provided LatestRevision must be true if RevisionName is empty; it must be
     * false when RevisionName is non-empty.
     * 
     */
    @InputImport(name="latestRevision")
      private final @Nullable Output<Boolean> latestRevision;

    public Output<Boolean> getLatestRevision() {
        return this.latestRevision == null ? Output.empty() : this.latestRevision;
    }

    /**
     * Percent specifies percent of the traffic to this Revision or Configuration.
     * 
     */
    @InputImport(name="percent", required=true)
      private final Output<Integer> percent;

    public Output<Integer> getPercent() {
        return this.percent;
    }

    /**
     * RevisionName of a specific revision to which to send this portion of traffic.
     * 
     */
    @InputImport(name="revisionName")
      private final @Nullable Output<String> revisionName;

    public Output<String> getRevisionName() {
        return this.revisionName == null ? Output.empty() : this.revisionName;
    }

    public ServiceTrafficArgs(
        @Nullable Output<Boolean> latestRevision,
        Output<Integer> percent,
        @Nullable Output<String> revisionName) {
        this.latestRevision = latestRevision;
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
        this.revisionName = revisionName;
    }

    private ServiceTrafficArgs() {
        this.latestRevision = Output.empty();
        this.percent = Output.empty();
        this.revisionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> latestRevision;
        private Output<Integer> percent;
        private @Nullable Output<String> revisionName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTrafficArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevision = defaults.latestRevision;
    	      this.percent = defaults.percent;
    	      this.revisionName = defaults.revisionName;
        }

        public Builder latestRevision(@Nullable Output<Boolean> latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }

        public Builder latestRevision(@Nullable Boolean latestRevision) {
            this.latestRevision = Output.ofNullable(latestRevision);
            return this;
        }

        public Builder percent(Output<Integer> percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }

        public Builder percent(Integer percent) {
            this.percent = Output.of(Objects.requireNonNull(percent));
            return this;
        }

        public Builder revisionName(@Nullable Output<String> revisionName) {
            this.revisionName = revisionName;
            return this;
        }

        public Builder revisionName(@Nullable String revisionName) {
            this.revisionName = Output.ofNullable(revisionName);
            return this;
        }
        public ServiceTrafficArgs build() {
            return new ServiceTrafficArgs(latestRevision, percent, revisionName);
        }
    }
}
