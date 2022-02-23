// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Schedule for backup
 * 
 */
public final class BackupScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupScheduleArgs Empty = new BackupScheduleArgs();

    /**
     * ISO 8601 repeating time interval format
     * 
     */
    @InputImport(name="repeatingTimeIntervals", required=true)
      private final Input<List<String>> repeatingTimeIntervals;

    public Input<List<String>> getRepeatingTimeIntervals() {
        return this.repeatingTimeIntervals;
    }

    public BackupScheduleArgs(Input<List<String>> repeatingTimeIntervals) {
        this.repeatingTimeIntervals = Objects.requireNonNull(repeatingTimeIntervals, "expected parameter 'repeatingTimeIntervals' to be non-null");
    }

    private BackupScheduleArgs() {
        this.repeatingTimeIntervals = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> repeatingTimeIntervals;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repeatingTimeIntervals = defaults.repeatingTimeIntervals;
        }

        public Builder setRepeatingTimeIntervals(Input<List<String>> repeatingTimeIntervals) {
            this.repeatingTimeIntervals = Objects.requireNonNull(repeatingTimeIntervals);
            return this;
        }

        public Builder setRepeatingTimeIntervals(List<String> repeatingTimeIntervals) {
            this.repeatingTimeIntervals = Input.of(Objects.requireNonNull(repeatingTimeIntervals));
            return this;
        }
        public BackupScheduleArgs build() {
            return new BackupScheduleArgs(repeatingTimeIntervals);
        }
    }
}
