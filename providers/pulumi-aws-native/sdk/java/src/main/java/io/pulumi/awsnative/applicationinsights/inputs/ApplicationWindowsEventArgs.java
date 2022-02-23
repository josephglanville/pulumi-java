// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationEventLevel;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Windows Event to be monitored for the component.
 * 
 */
public final class ApplicationWindowsEventArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationWindowsEventArgs Empty = new ApplicationWindowsEventArgs();

    /**
     * The levels of event to log.
     * 
     */
    @InputImport(name="eventLevels", required=true)
      private final Input<List<ApplicationEventLevel>> eventLevels;

    public Input<List<ApplicationEventLevel>> getEventLevels() {
        return this.eventLevels;
    }

    /**
     * The type of Windows Events to log.
     * 
     */
    @InputImport(name="eventName", required=true)
      private final Input<String> eventName;

    public Input<String> getEventName() {
        return this.eventName;
    }

    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    @InputImport(name="logGroupName", required=true)
      private final Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * The name of the log pattern set.
     * 
     */
    @InputImport(name="patternSet")
      private final @Nullable Input<String> patternSet;

    public Input<String> getPatternSet() {
        return this.patternSet == null ? Input.empty() : this.patternSet;
    }

    public ApplicationWindowsEventArgs(
        Input<List<ApplicationEventLevel>> eventLevels,
        Input<String> eventName,
        Input<String> logGroupName,
        @Nullable Input<String> patternSet) {
        this.eventLevels = Objects.requireNonNull(eventLevels, "expected parameter 'eventLevels' to be non-null");
        this.eventName = Objects.requireNonNull(eventName, "expected parameter 'eventName' to be non-null");
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.patternSet = patternSet;
    }

    private ApplicationWindowsEventArgs() {
        this.eventLevels = Input.empty();
        this.eventName = Input.empty();
        this.logGroupName = Input.empty();
        this.patternSet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationWindowsEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ApplicationEventLevel>> eventLevels;
        private Input<String> eventName;
        private Input<String> logGroupName;
        private @Nullable Input<String> patternSet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationWindowsEventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLevels = defaults.eventLevels;
    	      this.eventName = defaults.eventName;
    	      this.logGroupName = defaults.logGroupName;
    	      this.patternSet = defaults.patternSet;
        }

        public Builder setEventLevels(Input<List<ApplicationEventLevel>> eventLevels) {
            this.eventLevels = Objects.requireNonNull(eventLevels);
            return this;
        }

        public Builder setEventLevels(List<ApplicationEventLevel> eventLevels) {
            this.eventLevels = Input.of(Objects.requireNonNull(eventLevels));
            return this;
        }

        public Builder setEventName(Input<String> eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }

        public Builder setEventName(String eventName) {
            this.eventName = Input.of(Objects.requireNonNull(eventName));
            return this;
        }

        public Builder setLogGroupName(Input<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Input.of(Objects.requireNonNull(logGroupName));
            return this;
        }

        public Builder setPatternSet(@Nullable Input<String> patternSet) {
            this.patternSet = patternSet;
            return this;
        }

        public Builder setPatternSet(@Nullable String patternSet) {
            this.patternSet = Input.ofNullable(patternSet);
            return this;
        }
        public ApplicationWindowsEventArgs build() {
            return new ApplicationWindowsEventArgs(eventLevels, eventName, logGroupName, patternSet);
        }
    }
}
