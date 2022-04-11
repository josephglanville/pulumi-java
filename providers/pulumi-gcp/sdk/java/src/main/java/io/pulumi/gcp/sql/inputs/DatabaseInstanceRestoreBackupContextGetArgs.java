// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceRestoreBackupContextGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceRestoreBackupContextGetArgs Empty = new DatabaseInstanceRestoreBackupContextGetArgs();

    /**
     * The ID of the backup run to restore from.
     * 
     */
    @Import(name="backupRunId", required=true)
      private final Output<Integer> backupRunId;

    public Output<Integer> getBackupRunId() {
        return this.backupRunId;
    }

    /**
     * The ID of the instance that the backup was taken from. If left empty,
     * this instance's ID will be used.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * The full project ID of the source instance.`
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public DatabaseInstanceRestoreBackupContextGetArgs(
        Output<Integer> backupRunId,
        @Nullable Output<String> instanceId,
        @Nullable Output<String> project) {
        this.backupRunId = Objects.requireNonNull(backupRunId, "expected parameter 'backupRunId' to be non-null");
        this.instanceId = instanceId;
        this.project = project;
    }

    private DatabaseInstanceRestoreBackupContextGetArgs() {
        this.backupRunId = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceRestoreBackupContextGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> backupRunId;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceRestoreBackupContextGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRunId = defaults.backupRunId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder backupRunId(Output<Integer> backupRunId) {
            this.backupRunId = Objects.requireNonNull(backupRunId);
            return this;
        }
        public Builder backupRunId(Integer backupRunId) {
            this.backupRunId = Output.of(Objects.requireNonNull(backupRunId));
            return this;
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
        }        public DatabaseInstanceRestoreBackupContextGetArgs build() {
            return new DatabaseInstanceRestoreBackupContextGetArgs(backupRunId, instanceId, project);
        }
    }
}
