// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Directs Robo to interact with a specific UI element if it is encountered during the crawl. Currently, Robo can perform text entry or element click.
 * 
 */
public final class RoboDirectiveResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoboDirectiveResponse Empty = new RoboDirectiveResponse();

    /**
     * The type of action that Robo should perform on the specified element.
     * 
     */
    @Import(name="actionType", required=true)
      private final String actionType;

    public String getActionType() {
        return this.actionType;
    }

    /**
     * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK on the element matching the resource_name.
     * 
     */
    @Import(name="inputText", required=true)
      private final String inputText;

    public String getInputText() {
        return this.inputText;
    }

    /**
     * The android resource name of the target UI element. For example, in Java: R.string.foo in xml: @string/foo Only the "foo" part is needed. Reference doc: https://developer.android.com/guide/topics/resources/accessing-resources.html
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public RoboDirectiveResponse(
        String actionType,
        String inputText,
        String resourceName) {
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.inputText = Objects.requireNonNull(inputText, "expected parameter 'inputText' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private RoboDirectiveResponse() {
        this.actionType = null;
        this.inputText = null;
        this.resourceName = null;
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
