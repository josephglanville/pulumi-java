// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class BackupPlanAdvancedBackupSettingResourceTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPlanAdvancedBackupSettingResourceTypeArgs Empty = new BackupPlanAdvancedBackupSettingResourceTypeArgs();

    @Import(name="backupOptions", required=true)
      private final Output<Object> backupOptions;

    public Output<Object> getBackupOptions() {
        return this.backupOptions;
    }

    @Import(name="resourceType", required=true)
      private final Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType;
    }

    public BackupPlanAdvancedBackupSettingResourceTypeArgs(
        Output<Object> backupOptions,
        Output<String> resourceType) {
        this.backupOptions = Objects.requireNonNull(backupOptions, "expected parameter 'backupOptions' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private BackupPlanAdvancedBackupSettingResourceTypeArgs() {
        this.backupOptions = Codegen.empty();
        this.resourceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanAdvancedBackupSettingResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> backupOptions;
        private Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanAdvancedBackupSettingResourceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupOptions = defaults.backupOptions;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder backupOptions(Output<Object> backupOptions) {
            this.backupOptions = Objects.requireNonNull(backupOptions);
            return this;
        }
        public Builder backupOptions(Object backupOptions) {
            this.backupOptions = Output.of(Objects.requireNonNull(backupOptions));
            return this;
        }
        public Builder resourceType(Output<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Output.of(Objects.requireNonNull(resourceType));
            return this;
        }        public BackupPlanAdvancedBackupSettingResourceTypeArgs build() {
            return new BackupPlanAdvancedBackupSettingResourceTypeArgs(backupOptions, resourceType);
        }
    }
}
