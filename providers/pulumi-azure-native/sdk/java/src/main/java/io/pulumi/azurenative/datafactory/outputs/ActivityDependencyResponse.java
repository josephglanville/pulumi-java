// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ActivityDependencyResponse {
    private final String activity;
    private final List<String> dependencyConditions;

    @OutputCustomType.Constructor({"activity","dependencyConditions"})
    private ActivityDependencyResponse(
        String activity,
        List<String> dependencyConditions) {
        this.activity = Objects.requireNonNull(activity);
        this.dependencyConditions = Objects.requireNonNull(dependencyConditions);
    }

    public String getActivity() {
        return this.activity;
    }
    public List<String> getDependencyConditions() {
        return this.dependencyConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityDependencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activity;
        private List<String> dependencyConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityDependencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activity = defaults.activity;
    	      this.dependencyConditions = defaults.dependencyConditions;
        }

        public Builder setActivity(String activity) {
            this.activity = Objects.requireNonNull(activity);
            return this;
        }

        public Builder setDependencyConditions(List<String> dependencyConditions) {
            this.dependencyConditions = Objects.requireNonNull(dependencyConditions);
            return this;
        }

        public ActivityDependencyResponse build() {
            return new ActivityDependencyResponse(activity, dependencyConditions);
        }
    }
}
