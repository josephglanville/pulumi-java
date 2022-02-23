// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.inputs.LogRulesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MonitoringTagRulesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringTagRulesPropertiesArgs Empty = new MonitoringTagRulesPropertiesArgs();

    /**
     * Set of rules for sending logs for the Monitor resource.
     * 
     */
    @InputImport(name="logRules")
      private final @Nullable Input<LogRulesArgs> logRules;

    public Input<LogRulesArgs> getLogRules() {
        return this.logRules == null ? Input.empty() : this.logRules;
    }

    public MonitoringTagRulesPropertiesArgs(@Nullable Input<LogRulesArgs> logRules) {
        this.logRules = logRules;
    }

    private MonitoringTagRulesPropertiesArgs() {
        this.logRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringTagRulesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LogRulesArgs> logRules;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringTagRulesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logRules = defaults.logRules;
        }

        public Builder setLogRules(@Nullable Input<LogRulesArgs> logRules) {
            this.logRules = logRules;
            return this;
        }

        public Builder setLogRules(@Nullable LogRulesArgs logRules) {
            this.logRules = Input.ofNullable(logRules);
            return this;
        }
        public MonitoringTagRulesPropertiesArgs build() {
            return new MonitoringTagRulesPropertiesArgs(logRules);
        }
    }
}
