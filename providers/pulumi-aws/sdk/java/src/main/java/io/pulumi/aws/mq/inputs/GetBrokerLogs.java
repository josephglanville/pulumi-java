// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetBrokerLogs extends io.pulumi.resources.InvokeArgs {

    public static final GetBrokerLogs Empty = new GetBrokerLogs();

    @Import(name="audit", required=true)
      private final Boolean audit;

    public Boolean getAudit() {
        return this.audit;
    }

    @Import(name="general", required=true)
      private final Boolean general;

    public Boolean getGeneral() {
        return this.general;
    }

    public GetBrokerLogs(
        Boolean audit,
        Boolean general) {
        this.audit = Objects.requireNonNull(audit, "expected parameter 'audit' to be non-null");
        this.general = Objects.requireNonNull(general, "expected parameter 'general' to be non-null");
    }

    private GetBrokerLogs() {
        this.audit = null;
        this.general = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean audit;
        private Boolean general;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audit = defaults.audit;
    	      this.general = defaults.general;
        }

        public Builder audit(Boolean audit) {
            this.audit = Objects.requireNonNull(audit);
            return this;
        }
        public Builder general(Boolean general) {
            this.general = Objects.requireNonNull(general);
            return this;
        }        public GetBrokerLogs build() {
            return new GetBrokerLogs(audit, general);
        }
    }
}
