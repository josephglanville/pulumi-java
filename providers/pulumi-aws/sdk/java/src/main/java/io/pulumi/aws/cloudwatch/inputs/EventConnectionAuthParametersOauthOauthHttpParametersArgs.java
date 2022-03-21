// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs;
import io.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersOauthOauthHttpParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthOauthHttpParametersArgs Empty = new EventConnectionAuthParametersOauthOauthHttpParametersArgs();

    /**
     * Contains additional body string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="bodies")
      private final @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>> bodies;

    public Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>> getBodies() {
        return this.bodies == null ? Output.empty() : this.bodies;
    }

    /**
     * Contains additional header parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>> headers;

    public Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>> getHeaders() {
        return this.headers == null ? Output.empty() : this.headers;
    }

    /**
     * Contains additional query string parameters for the connection. You can include up to 100 additional body string parameters per request. Each additional parameter counts towards the event payload size, which cannot exceed 64 KB. Each parameter can contain the following:
     * 
     */
    @Import(name="queryStrings")
      private final @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>> queryStrings;

    public Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>> getQueryStrings() {
        return this.queryStrings == null ? Output.empty() : this.queryStrings;
    }

    public EventConnectionAuthParametersOauthOauthHttpParametersArgs(
        @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>> bodies,
        @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>> headers,
        @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>> queryStrings) {
        this.bodies = bodies;
        this.headers = headers;
        this.queryStrings = queryStrings;
    }

    private EventConnectionAuthParametersOauthOauthHttpParametersArgs() {
        this.bodies = Output.empty();
        this.headers = Output.empty();
        this.queryStrings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthOauthHttpParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>> bodies;
        private @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>> headers;
        private @Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthOauthHttpParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodies = defaults.bodies;
    	      this.headers = defaults.headers;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder bodies(@Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs>> bodies) {
            this.bodies = bodies;
            return this;
        }
        public Builder bodies(@Nullable List<EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs> bodies) {
            this.bodies = Output.ofNullable(bodies);
            return this;
        }
        public Builder bodies(EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs... bodies) {
            return bodies(List.of(bodies));
        }
        public Builder headers(@Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs> headers) {
            this.headers = Output.ofNullable(headers);
            return this;
        }
        public Builder headers(EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs... headers) {
            return headers(List.of(headers));
        }
        public Builder queryStrings(@Nullable Output<List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs>> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }
        public Builder queryStrings(@Nullable List<EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs> queryStrings) {
            this.queryStrings = Output.ofNullable(queryStrings);
            return this;
        }
        public Builder queryStrings(EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs... queryStrings) {
            return queryStrings(List.of(queryStrings));
        }        public EventConnectionAuthParametersOauthOauthHttpParametersArgs build() {
            return new EventConnectionAuthParametersOauthOauthHttpParametersArgs(bodies, headers, queryStrings);
        }
    }
}
