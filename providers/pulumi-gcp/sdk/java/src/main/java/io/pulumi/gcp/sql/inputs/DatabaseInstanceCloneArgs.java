// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceCloneArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceCloneArgs Empty = new DatabaseInstanceCloneArgs();

    /**
     * The timestamp of the point in time that should be restored.
     * 
     */
    @Import(name="pointInTime")
      private final @Nullable Output<String> pointInTime;

    public Output<String> getPointInTime() {
        return this.pointInTime == null ? Codegen.empty() : this.pointInTime;
    }

    /**
     * Name of the source instance which will be cloned.
     * 
     */
    @Import(name="sourceInstanceName", required=true)
      private final Output<String> sourceInstanceName;

    public Output<String> getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    public DatabaseInstanceCloneArgs(
        @Nullable Output<String> pointInTime,
        Output<String> sourceInstanceName) {
        this.pointInTime = pointInTime;
        this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName, "expected parameter 'sourceInstanceName' to be non-null");
    }

    private DatabaseInstanceCloneArgs() {
        this.pointInTime = Codegen.empty();
        this.sourceInstanceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceCloneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> pointInTime;
        private Output<String> sourceInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceCloneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTime = defaults.pointInTime;
    	      this.sourceInstanceName = defaults.sourceInstanceName;
        }

        public Builder pointInTime(@Nullable Output<String> pointInTime) {
            this.pointInTime = pointInTime;
            return this;
        }
        public Builder pointInTime(@Nullable String pointInTime) {
            this.pointInTime = Codegen.ofNullable(pointInTime);
            return this;
        }
        public Builder sourceInstanceName(Output<String> sourceInstanceName) {
            this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
            return this;
        }
        public Builder sourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = Output.of(Objects.requireNonNull(sourceInstanceName));
            return this;
        }        public DatabaseInstanceCloneArgs build() {
            return new DatabaseInstanceCloneArgs(pointInTime, sourceInstanceName);
        }
    }
}
