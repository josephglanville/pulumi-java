// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Exit code from a tool execution.
 * 
 */
public final class ToolExitCodeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ToolExitCodeResponse Empty = new ToolExitCodeResponse();

    /**
     * Tool execution exit code. A value of 0 means that the execution was successful. - In response: always set - In create/update request: always set
     * 
     */
    @Import(name="number", required=true)
      private final Integer number;

    public Integer getNumber() {
        return this.number;
    }

    public ToolExitCodeResponse(Integer number) {
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
    }

    private ToolExitCodeResponse() {
        this.number = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExitCodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer number;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolExitCodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.number = defaults.number;
        }

        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }        public ToolExitCodeResponse build() {
            return new ToolExitCodeResponse(number);
        }
    }
}
