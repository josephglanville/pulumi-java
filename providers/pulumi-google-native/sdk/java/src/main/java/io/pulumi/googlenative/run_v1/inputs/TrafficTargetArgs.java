// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TrafficTarget holds a single entry of the routing table for a Route.
 * 
 */
public final class TrafficTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficTargetArgs Empty = new TrafficTargetArgs();

    /**
     * ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the "status.latestReadyRevisionName" of the referenced configuration changes, we will automatically migrate traffic from the prior "latest ready" revision to the new one. This field is never set in Route's status, only its spec. This is mutually exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
     * 
     */
    @Import(name="configurationName")
      private final @Nullable Output<String> configurationName;

    public Output<String> getConfigurationName() {
        return this.configurationName == null ? Codegen.empty() : this.configurationName;
    }

    /**
     * Optional. LatestRevision may be provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must be true if RevisionName is empty; it must be false when RevisionName is non-empty.
     * 
     */
    @Import(name="latestRevision")
      private final @Nullable Output<Boolean> latestRevision;

    public Output<Boolean> getLatestRevision() {
        return this.latestRevision == null ? Codegen.empty() : this.latestRevision;
    }

    /**
     * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified.
     * 
     */
    @Import(name="percent")
      private final @Nullable Output<Integer> percent;

    public Output<Integer> getPercent() {
        return this.percent == null ? Codegen.empty() : this.percent;
    }

    /**
     * RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName.
     * 
     */
    @Import(name="revisionName")
      private final @Nullable Output<String> revisionName;

    public Output<String> getRevisionName() {
        return this.revisionName == null ? Codegen.empty() : this.revisionName;
    }

    /**
     * Optional. Tag is used to expose a dedicated url for referencing this target exclusively.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Codegen.empty() : this.tag;
    }

    public TrafficTargetArgs(
        @Nullable Output<String> configurationName,
        @Nullable Output<Boolean> latestRevision,
        @Nullable Output<Integer> percent,
        @Nullable Output<String> revisionName,
        @Nullable Output<String> tag) {
        this.configurationName = configurationName;
        this.latestRevision = latestRevision;
        this.percent = percent;
        this.revisionName = revisionName;
        this.tag = tag;
    }

    private TrafficTargetArgs() {
        this.configurationName = Codegen.empty();
        this.latestRevision = Codegen.empty();
        this.percent = Codegen.empty();
        this.revisionName = Codegen.empty();
        this.tag = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationName;
        private @Nullable Output<Boolean> latestRevision;
        private @Nullable Output<Integer> percent;
        private @Nullable Output<String> revisionName;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.latestRevision = defaults.latestRevision;
    	      this.percent = defaults.percent;
    	      this.revisionName = defaults.revisionName;
    	      this.tag = defaults.tag;
        }

        public Builder configurationName(@Nullable Output<String> configurationName) {
            this.configurationName = configurationName;
            return this;
        }
        public Builder configurationName(@Nullable String configurationName) {
            this.configurationName = Codegen.ofNullable(configurationName);
            return this;
        }
        public Builder latestRevision(@Nullable Output<Boolean> latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }
        public Builder latestRevision(@Nullable Boolean latestRevision) {
            this.latestRevision = Codegen.ofNullable(latestRevision);
            return this;
        }
        public Builder percent(@Nullable Output<Integer> percent) {
            this.percent = percent;
            return this;
        }
        public Builder percent(@Nullable Integer percent) {
            this.percent = Codegen.ofNullable(percent);
            return this;
        }
        public Builder revisionName(@Nullable Output<String> revisionName) {
            this.revisionName = revisionName;
            return this;
        }
        public Builder revisionName(@Nullable String revisionName) {
            this.revisionName = Codegen.ofNullable(revisionName);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }        public TrafficTargetArgs build() {
            return new TrafficTargetArgs(configurationName, latestRevision, percent, revisionName, tag);
        }
    }
}
