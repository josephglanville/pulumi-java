// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.backup.inputs.BackupPlanResourceTypeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPlanArgs Empty = new BackupPlanArgs();

    @InputImport(name="backupPlan", required=true)
      private final Input<BackupPlanResourceTypeArgs> backupPlan;

    public Input<BackupPlanResourceTypeArgs> getBackupPlan() {
        return this.backupPlan;
    }

    @InputImport(name="backupPlanTags")
      private final @Nullable Input<Object> backupPlanTags;

    public Input<Object> getBackupPlanTags() {
        return this.backupPlanTags == null ? Input.empty() : this.backupPlanTags;
    }

    public BackupPlanArgs(
        Input<BackupPlanResourceTypeArgs> backupPlan,
        @Nullable Input<Object> backupPlanTags) {
        this.backupPlan = Objects.requireNonNull(backupPlan, "expected parameter 'backupPlan' to be non-null");
        this.backupPlanTags = backupPlanTags;
    }

    private BackupPlanArgs() {
        this.backupPlan = Input.empty();
        this.backupPlanTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BackupPlanResourceTypeArgs> backupPlan;
        private @Nullable Input<Object> backupPlanTags;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPlan = defaults.backupPlan;
    	      this.backupPlanTags = defaults.backupPlanTags;
        }

        public Builder setBackupPlan(Input<BackupPlanResourceTypeArgs> backupPlan) {
            this.backupPlan = Objects.requireNonNull(backupPlan);
            return this;
        }

        public Builder setBackupPlan(BackupPlanResourceTypeArgs backupPlan) {
            this.backupPlan = Input.of(Objects.requireNonNull(backupPlan));
            return this;
        }

        public Builder setBackupPlanTags(@Nullable Input<Object> backupPlanTags) {
            this.backupPlanTags = backupPlanTags;
            return this;
        }

        public Builder setBackupPlanTags(@Nullable Object backupPlanTags) {
            this.backupPlanTags = Input.ofNullable(backupPlanTags);
            return this;
        }
        public BackupPlanArgs build() {
            return new BackupPlanArgs(backupPlan, backupPlanTags);
        }
    }
}
