// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterS3ImportArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterS3ImportArgs Empty = new ClusterS3ImportArgs();

    /**
     * The bucket name where your backup is stored
     * 
     */
    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * Can be blank, but is the path to your backup
     * 
     */
    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Output.empty() : this.bucketPrefix;
    }

    /**
     * Role applied to load the data.
     * 
     */
    @Import(name="ingestionRole", required=true)
      private final Output<String> ingestionRole;

    public Output<String> getIngestionRole() {
        return this.ingestionRole;
    }

    /**
     * Source engine for the backup
     * 
     */
    @Import(name="sourceEngine", required=true)
      private final Output<String> sourceEngine;

    public Output<String> getSourceEngine() {
        return this.sourceEngine;
    }

    /**
     * Version of the source engine used to make the backup
     * 
     */
    @Import(name="sourceEngineVersion", required=true)
      private final Output<String> sourceEngineVersion;

    public Output<String> getSourceEngineVersion() {
        return this.sourceEngineVersion;
    }

    public ClusterS3ImportArgs(
        Output<String> bucketName,
        @Nullable Output<String> bucketPrefix,
        Output<String> ingestionRole,
        Output<String> sourceEngine,
        Output<String> sourceEngineVersion) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.ingestionRole = Objects.requireNonNull(ingestionRole, "expected parameter 'ingestionRole' to be non-null");
        this.sourceEngine = Objects.requireNonNull(sourceEngine, "expected parameter 'sourceEngine' to be non-null");
        this.sourceEngineVersion = Objects.requireNonNull(sourceEngineVersion, "expected parameter 'sourceEngineVersion' to be non-null");
    }

    private ClusterS3ImportArgs() {
        this.bucketName = Output.empty();
        this.bucketPrefix = Output.empty();
        this.ingestionRole = Output.empty();
        this.sourceEngine = Output.empty();
        this.sourceEngineVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterS3ImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketName;
        private @Nullable Output<String> bucketPrefix;
        private Output<String> ingestionRole;
        private Output<String> sourceEngine;
        private Output<String> sourceEngineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterS3ImportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.ingestionRole = defaults.ingestionRole;
    	      this.sourceEngine = defaults.sourceEngine;
    	      this.sourceEngineVersion = defaults.sourceEngineVersion;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Output.ofNullable(bucketPrefix);
            return this;
        }
        public Builder ingestionRole(Output<String> ingestionRole) {
            this.ingestionRole = Objects.requireNonNull(ingestionRole);
            return this;
        }
        public Builder ingestionRole(String ingestionRole) {
            this.ingestionRole = Output.of(Objects.requireNonNull(ingestionRole));
            return this;
        }
        public Builder sourceEngine(Output<String> sourceEngine) {
            this.sourceEngine = Objects.requireNonNull(sourceEngine);
            return this;
        }
        public Builder sourceEngine(String sourceEngine) {
            this.sourceEngine = Output.of(Objects.requireNonNull(sourceEngine));
            return this;
        }
        public Builder sourceEngineVersion(Output<String> sourceEngineVersion) {
            this.sourceEngineVersion = Objects.requireNonNull(sourceEngineVersion);
            return this;
        }
        public Builder sourceEngineVersion(String sourceEngineVersion) {
            this.sourceEngineVersion = Output.of(Objects.requireNonNull(sourceEngineVersion));
            return this;
        }        public ClusterS3ImportArgs build() {
            return new ClusterS3ImportArgs(bucketName, bucketPrefix, ingestionRole, sourceEngine, sourceEngineVersion);
        }
    }
}
