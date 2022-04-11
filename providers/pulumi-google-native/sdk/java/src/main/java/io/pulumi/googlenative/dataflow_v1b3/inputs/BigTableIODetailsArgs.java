// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata for a Cloud Bigtable connector used by the job.
 * 
 */
public final class BigTableIODetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BigTableIODetailsArgs Empty = new BigTableIODetailsArgs();

    /**
     * InstanceId accessed in the connection.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * ProjectId accessed in the connection.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * TableId accessed in the connection.
     * 
     */
    @Import(name="tableId")
      private final @Nullable Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId == null ? Codegen.empty() : this.tableId;
    }

    public BigTableIODetailsArgs(
        @Nullable Output<String> instanceId,
        @Nullable Output<String> project,
        @Nullable Output<String> tableId) {
        this.instanceId = instanceId;
        this.project = project;
        this.tableId = tableId;
    }

    private BigTableIODetailsArgs() {
        this.instanceId = Codegen.empty();
        this.project = Codegen.empty();
        this.tableId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigTableIODetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> project;
        private @Nullable Output<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(BigTableIODetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Codegen.ofNullable(instanceId);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder tableId(@Nullable Output<String> tableId) {
            this.tableId = tableId;
            return this;
        }
        public Builder tableId(@Nullable String tableId) {
            this.tableId = Codegen.ofNullable(tableId);
            return this;
        }        public BigTableIODetailsArgs build() {
            return new BigTableIODetailsArgs(instanceId, project, tableId);
        }
    }
}
