// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codestarnotifications.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNotificationRuleArgs Empty = new GetNotificationRuleArgs();

    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetNotificationRuleArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetNotificationRuleArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }        public GetNotificationRuleArgs build() {
            return new GetNotificationRuleArgs(arn);
        }
    }
}
