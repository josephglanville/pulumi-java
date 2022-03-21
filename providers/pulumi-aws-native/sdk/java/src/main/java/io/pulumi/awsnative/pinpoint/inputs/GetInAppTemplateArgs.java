// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.pinpoint.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInAppTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInAppTemplateArgs Empty = new GetInAppTemplateArgs();

    @Import(name="templateName", required=true)
      private final String templateName;

    public String getTemplateName() {
        return this.templateName;
    }

    public GetInAppTemplateArgs(String templateName) {
        this.templateName = Objects.requireNonNull(templateName, "expected parameter 'templateName' to be non-null");
    }

    private GetInAppTemplateArgs() {
        this.templateName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInAppTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String templateName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInAppTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templateName = defaults.templateName;
        }

        public Builder templateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }        public GetInAppTemplateArgs build() {
            return new GetInAppTemplateArgs(templateName);
        }
    }
}
