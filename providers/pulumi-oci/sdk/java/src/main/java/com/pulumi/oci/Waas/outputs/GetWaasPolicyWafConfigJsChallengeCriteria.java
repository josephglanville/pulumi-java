// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWaasPolicyWafConfigJsChallengeCriteria {
    /**
     * @return The criteria the access rule and JavaScript Challenge uses to determine if action should be taken on a request.
     * * **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the `value` field. URL must start with a `/`.
     * * **URL_IS_NOT:** Matches if the concatenation of request URL path and query is not identical to the contents of the `value` field. URL must start with a `/`.
     * * **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the `value` field. URL must start with a `/`.
     * * **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the `value` field.
     * * **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the `value` field.
     * * **URL_REGEX:** Matches if the concatenation of request URL path and query is described by the regular expression in the value field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * * **URL_DOES_NOT_MATCH_REGEX:** Matches if the concatenation of request URL path and query is not described by the regular expression in the `value` field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * * **URL_DOES_NOT_START_WITH:** Matches if the concatenation of request URL path and query does not start with the contents of the `value` field.
     * * **URL_PART_DOES_NOT_CONTAIN:** Matches if the concatenation of request URL path and query does not contain the contents of the `value` field.
     * * **URL_PART_DOES_NOT_END_WITH:** Matches if the concatenation of request URL path and query does not end with the contents of the `value` field.
     * * **IP_IS:** Matches if the request originates from one of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \n *Example:* &#34;1.1.1.1\n1.1.1.2\n1.2.2.1/30&#34;
     * * **IP_IS_NOT:** Matches if the request does not originate from any of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \n *Example:* &#34;1.1.1.1\n1.1.1.2\n1.2.2.1/30&#34;
     * * **IP_IN_LIST:** Matches if the request originates from one of the IP addresses contained in the referenced address list. The `value` in this case is OCID of the address list.
     * * **IP_NOT_IN_LIST:** Matches if the request does not originate from any IP address contained in the referenced address list. The `value` field in this case is OCID of the address list.
     * * **HTTP_HEADER_CONTAINS:** The HTTP_HEADER_CONTAINS criteria is defined using a compound value separated by a colon: a header field name and a header field value. `host:test.example.com` is an example of a criteria value where `host` is the header field name and `test.example.com` is the header field value. A request matches when the header field name is a case insensitive match and the header field value is a case insensitive, substring match. *Example:* With a criteria value of `host:test.example.com`, where `host` is the name of the field and `test.example.com` is the value of the host field, a request with the header values, `Host: www.test.example.com` will match, where as a request with header values of `host: www.example.com` or `host: test.sub.example.com` will not match.
     * * **HTTP_METHOD_IS:** Matches if the request method is identical to one of the values listed in field. The `value` in this case is string with one or multiple HTTP methods separated by new line symbol \n The list of available methods: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`
     * 
     */
    private final String condition;
    /**
     * @return When enabled, the condition will be matched with case-sensitive rules.
     * 
     */
    private final Boolean isCaseSensitive;
    /**
     * @return The value of the header.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetWaasPolicyWafConfigJsChallengeCriteria(
        @CustomType.Parameter("condition") String condition,
        @CustomType.Parameter("isCaseSensitive") Boolean isCaseSensitive,
        @CustomType.Parameter("value") String value) {
        this.condition = condition;
        this.isCaseSensitive = isCaseSensitive;
        this.value = value;
    }

    /**
     * @return The criteria the access rule and JavaScript Challenge uses to determine if action should be taken on a request.
     * * **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the `value` field. URL must start with a `/`.
     * * **URL_IS_NOT:** Matches if the concatenation of request URL path and query is not identical to the contents of the `value` field. URL must start with a `/`.
     * * **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the `value` field. URL must start with a `/`.
     * * **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the `value` field.
     * * **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the `value` field.
     * * **URL_REGEX:** Matches if the concatenation of request URL path and query is described by the regular expression in the value field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * * **URL_DOES_NOT_MATCH_REGEX:** Matches if the concatenation of request URL path and query is not described by the regular expression in the `value` field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * * **URL_DOES_NOT_START_WITH:** Matches if the concatenation of request URL path and query does not start with the contents of the `value` field.
     * * **URL_PART_DOES_NOT_CONTAIN:** Matches if the concatenation of request URL path and query does not contain the contents of the `value` field.
     * * **URL_PART_DOES_NOT_END_WITH:** Matches if the concatenation of request URL path and query does not end with the contents of the `value` field.
     * * **IP_IS:** Matches if the request originates from one of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \n *Example:* &#34;1.1.1.1\n1.1.1.2\n1.2.2.1/30&#34;
     * * **IP_IS_NOT:** Matches if the request does not originate from any of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \n *Example:* &#34;1.1.1.1\n1.1.1.2\n1.2.2.1/30&#34;
     * * **IP_IN_LIST:** Matches if the request originates from one of the IP addresses contained in the referenced address list. The `value` in this case is OCID of the address list.
     * * **IP_NOT_IN_LIST:** Matches if the request does not originate from any IP address contained in the referenced address list. The `value` field in this case is OCID of the address list.
     * * **HTTP_HEADER_CONTAINS:** The HTTP_HEADER_CONTAINS criteria is defined using a compound value separated by a colon: a header field name and a header field value. `host:test.example.com` is an example of a criteria value where `host` is the header field name and `test.example.com` is the header field value. A request matches when the header field name is a case insensitive match and the header field value is a case insensitive, substring match. *Example:* With a criteria value of `host:test.example.com`, where `host` is the name of the field and `test.example.com` is the value of the host field, a request with the header values, `Host: www.test.example.com` will match, where as a request with header values of `host: www.example.com` or `host: test.sub.example.com` will not match.
     * * **HTTP_METHOD_IS:** Matches if the request method is identical to one of the values listed in field. The `value` in this case is string with one or multiple HTTP methods separated by new line symbol \n The list of available methods: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return When enabled, the condition will be matched with case-sensitive rules.
     * 
     */
    public Boolean isCaseSensitive() {
        return this.isCaseSensitive;
    }
    /**
     * @return The value of the header.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWaasPolicyWafConfigJsChallengeCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private Boolean isCaseSensitive;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWaasPolicyWafConfigJsChallengeCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.isCaseSensitive = defaults.isCaseSensitive;
    	      this.value = defaults.value;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder isCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = Objects.requireNonNull(isCaseSensitive);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetWaasPolicyWafConfigJsChallengeCriteria build() {
            return new GetWaasPolicyWafConfigJsChallengeCriteria(condition, isCaseSensitive, value);
        }
    }
}
