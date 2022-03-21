// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RoboDirectiveResponse {
    /**
     * The type of action that Robo should perform on the specified element.
     * 
     */
    private final String actionType;
    /**
     * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK on the element matching the resource_name.
     * 
     */
    private final String inputText;
    /**
     * The android resource name of the target UI element. For example, in Java: R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc: https://developer.android.com/guide/topics/resources/accessing-resources.html
     * 
     */
    private final String resourceName;

    @CustomType.Constructor
    private RoboDirectiveResponse(
        @CustomType.Parameter("actionType") String actionType,
        @CustomType.Parameter("inputText") String inputText,
        @CustomType.Parameter("resourceName") String resourceName) {
        this.actionType = actionType;
        this.inputText = inputText;
        this.resourceName = resourceName;
    }

    /**
     * The type of action that Robo should perform on the specified element.
     * 
    */
    public String getActionType() {
        return this.actionType;
    }
    /**
     * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK on the element matching the resource_name.
     * 
    */
    public String getInputText() {
        return this.inputText;
    }
    /**
     * The android resource name of the target UI element. For example, in Java: R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc: https://developer.android.com/guide/topics/resources/accessing-resources.html
     * 
    */
    public String getPropResourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoboDirectiveResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private String inputText;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RoboDirectiveResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.inputText = defaults.inputText;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder inputText(String inputText) {
            this.inputText = Objects.requireNonNull(inputText);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public RoboDirectiveResponse build() {
            return new RoboDirectiveResponse(actionType, inputText, resourceName);
        }
    }
}
